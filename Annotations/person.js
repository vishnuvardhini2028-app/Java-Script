class person
{
  constructor(name,age)
    {
         
        this.name=name;
        this.age=age;
    }
  greet() 
  {
    return `Hello, my name is ${this.name} and I am ${this.age} years old`;
  }
    
}
const p1 = new person("Vishnu", 23);
console.log(p1.greet());