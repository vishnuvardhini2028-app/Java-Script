import { add,sub,mul,div } from "./math.js";
const button=document.getElementById('btn');

button.addEventListener('click',()=>{
    const num1=Number(document.getElementById('num1').value);
    const num2=Number(document.getElementById('num2').value);
    const result=add(num1,num2);
    document.getElementById('value').innerText="result :" +" "+ result;
});
const btn1=document.getElementById('btn1');
btn1.addEventListener('click',()=>{
    const num1=Number(document.getElementById('num1').value);
    const num2=Number(document.getElementById('num2').value);
    const result=sub(num1,num2);
    document.getElementById('value').innerText="result : " + result;
});
const btn2=document.getElementById('btn2');
btn2.addEventListener('click',()=>{
    const num1=Number(document.getElementById('num1').value);
    const num2=Number(document.getElementById('num2').value);
    const result=mul(num1,num2);
    document.getElementById('value').innerText="result : " +result;
});
const btn3=document.getElementById('btn3');
btn3.addEventListener('click',()=>{
    const num1=Number(document.getElementById('num1').value);
    const num2=Number(document.getElementById('num2').value);
    const result=div(num1,num2);
    document.getElementById('value').innerText="result : " +result;
});