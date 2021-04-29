//HTML Elements
const statusDiv = document.getElementById('status');
const restartBtn = [...document.getElementsByClassName('restartBtn')];
const boxes = Array.from(document.getElementsByClassName('box'));
const letsPlayText = document.getElementById('letsPlay');
const board = document.getElementById('gameboard');
const playerTurn = document.getElementById('status')
const winnermsgcontainer = document.getElementById('winnermsg')
const winnermsg = document.getElementById('winningMsgTxt');



const winningCombos = [
    [0,1,2], //top horizontal
    [0,4,8], // top left - diagonal
    [0,3,6], // top left vertical
    [1,4,7],// middle vertical
    [3,4,5], // middle horizaontal
    [2,4,6], // top right diagonal
    [2,5,8], // top right vertical
    [6,7,8] // bottom horizontal
]


//game variables

const playerX = "X";
const playerO = "O";
let currentPlayer = playerX;
let count = 0;
let gameIsLive = true;
let xIsNext = true;
let Xwins =0;
let Owins = 0;


//button reset


const restartGame = (event) => {
    boxes.innerText = '';
    count = 0;
    boxes.forEach(box => {
        box.innerText = '';
    })
    currentPlayer = playerX;
    xIsNext = true;
    playerTurn.innerText = 'X is next'
    winnermsgcontainer.style.display = 'none';
    boxes.forEach(gameboard)
};

restartBtn.forEach(n => n.addEventListener ('click', restartGame)); 



//handling cells
const gameboard = function boxClick(box,index) {
    box.addEventListener('click',boxclicked, {once:true})
}

boxes.forEach(gameboard)
//array.forEach(callback(item [, index [, array]
// this will check for the index of each box

function boxclicked(event) { 
    
    const boxTargeted = event.target

    // switches between X's and O's
    count++
    boxTargeted.innerHTML = (currentPlayer);
    if(xIsNext) {
        
        currentPlayer = playerO
       
    } else {
        currentPlayer = playerX
        
    }
    playerTurn.innerHTML = `${currentPlayer} is next`
    xIsNext = !xIsNext
    const wasWinner = checkWinner()
    // checks for draw
    if(!wasWinner && count > 8){
        playerTurn.innerText = 'Draw'
        winnermsg.innerText = "It's a draw!"
        winnermsgcontainer.style.display = 'flex';
    }
    //games rounds
    if (wasWinner){
        winnermsgcontainer.style.display = 'flex';
        if (Owins >= 2 || Xwins >= 2) {
                winnermsg.innerText = `Game Over! ${Owins > Xwins ? playerO : playerX} wins! `
                Owins= 0;
                Xwins= 0;
        }
    }
}


function checkWinner() { 
  
    for(let i = 0; i < winningCombos.length; i++){
            
       let checkWinnerX = winningCombos[i].every((num) => { 
                //[0,1,2]
               let element = document.getElementById('box'+num)
               if (element.innerText === playerX) {
                   
                    return true
               } 
                return false
            })

        let checkWinnerO = winningCombos[i].every((num) => {
                //[0,1,2]
               let element = document.getElementById('box'+num)
               if (element.innerText === playerO) {
                   
                    return true
               } 
                return false
            })


        if (checkWinnerX){
            winnermsg.innerText = `${playerX} is the winner`
            Xwins++
            return true;
        } 
        
        if (checkWinnerO) {
            winnermsg.innerText = `${playerO} is the winner`
            Owins++
            return true;

        }
     
  }
  return false;
}

