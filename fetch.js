fetch(httpsjsonplaceholder.typicode.comtodos)
.then(Response=Response.json())
.then(data={
    let completedTasks = data.filter(task = task.completed === true);

    
    completedTasks.forEach(task = {
    console.log(ID +task.id+, Title +task.title);
})
})
.catch(data={
    console.log(Error);
})