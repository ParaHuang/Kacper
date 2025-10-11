//all javascript code
/*
line 1
line 2
*/

// alert('hello');

//1.define a function

// public int test(int a,String b,double c){
// 
//     return 10;
// }
/*
function funName(a,b,c){

}
*/

function test(){
    alert("hello");
    alert("hello again");
}

function print1(){
    alert("hey");
}

function print2(){
    alert("hi");
}

function print(content){
    alert(content);
}

function changeColor(){
    //get the value of that text box
    //1.get the object of a component
    var colorBox = document.getElementById("colorBox");
    // console.log(colorBox);
    var color = colorBox.value;
    console.log(color);
        
    document.bgColor = color;
}

//2.use/call the function
//directy call it in javascirpt code
// test();
//bind function with a event
//<button onclick="test()">click me</button>

