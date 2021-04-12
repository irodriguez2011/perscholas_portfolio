
// This is a program that will go through the tasks that I have completed versus what I have left to do

 let tasksCompleted = ['workout', 'make bed','wash dishes', 'clean bathroom','prep lunch']
 let todoList = ['return package', 'donate clothes', 'clean bathroom', 'homework']
 

let alreadyDone = [];
// a nested for loop is created to iterate through both arrays and compare items
 for (let i = 0; i < tasksCompleted.length; i++ ) {
        // i is set as the counter that will iterate through each element of the tasksCompleted Array
        for (let todoCounter = 0; todoCounter < todoList.length; todoCounter++) {

    //  nested for loop will compare each item of the first array with each item of the second array to see if there are similar tasks

                    tasksCompleted[i].toLowerCase(); 
                    todoList[todoCounter].toLowerCase();
            if (tasksCompleted[i] === todoList[todoCounter]) {
                // if any of the tasks in tasksCompleted match any of the tasks in todolist, then it will be push to the third array, alreadyDone
                    alreadyDone.push(tasksCompleted[i])
            }

        }
        
 }
 console.log(alreadyDone)
// this for loop will check to see if "clean stove" is already on my to do list
// and if it isn't then the code will push it to the array todoList
 for (let j =0; j < todoList.length; j++) {
            todoList[j].toLowerCase();

            if (todoList[j].includes('clean stove') === false) {
                todoList.push('clean stove')
        } break;
        /* the break was added to stop the for loop from continuing to check for
         "clean stove" as the counter continues to increment
        once it has found that "clean stove" is not on the list it will push it to the array and stop the loop */

 }

console.log(todoList);