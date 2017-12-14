var hrac=1;
var score1=0;
var score2=0;
var turn1=-1;
var turn2=-1;
var turnGuessed;
var field=[[1,1,2,2], [3,3,4,4], [5,5,6,6], [7,7,8,8]];
shuffle();

function shuffle()
{
    var i,temp;
    for(i=0;i<20;i++)
        {
    var r1=Math.floor(Math.random() *4);
    var c1=Math.floor(Math.random() *4);
    var r2=Math.floor(Math.random() *4);
    var c2=Math.floor(Math.random() *4);
            
            temp = field[r1][c1];
            field[r1][c1]=field[r2][c2];
            field[r2][c2]=temp;
            
        }
        console.log("Shuffle finished: ");
        console.log(field);
}

function clickImg(value)
{
    if(turn2!=-1)
        return;
    var row=Math.floor(value/10);
    var col=value%10;
    
    if(field[row][col]==0)
        return;
    
     console.log("You clicked: row:"+row+" col:"+col);
    if(turn1==row*10+col)
        return;
    
    if(field[row][col]>0)
        {
            var source="img/img"+field[row][col]+".png";
            var imageId="img"+row+col;
            console.log(imageId);
            document.getElementById(imageId).src=source;
        }
    if(turn1==-1)
        turn1=row*10+col;
    else{
        turn2=row*10+col;
        checkSelectedCards();
    }
}

function checkSelectedCards()
{
    var row1=Math.floor(turn1/10);
    var col1=turn1%10;
    var row2=Math.floor(turn2/10);
    var col2=turn2%10;
   
    if(field[row1][col1]==field[row2][col2])
        {
            //good
            if(hrac==1){
                score1++;
            }else{
                score2++;
            }
            
            turnGuessed=turn1;
            setTimeout(moveCard,1500);
            updateScore();
        }
    else{
        //bad
        setTimeout(turnBack,2000);
        hrac=hrac==1?2:1;
    }
}

function turnBack(){
    var row1=Math.floor(turn1/10);
    var col1=turn1%10;
    var row2=Math.floor(turn2/10);
    var col2=turn2%10;
    var imageId="img"+row1+col1;
    document.getElementById(imageId).src="img/pexeso_logo.jpeg";
    var imageId="img"+row2+col2;
    document.getElementById(imageId).src="img/pexeso_logo.jpeg";
    turn1=-1;
    turn2=-1;
    
}

function reload(){
    if(confirm("Chcete restartovat?")==true){
    location.reload();
    }
}

function doubleClick() {
    document.getElementById("name1").innerHTML='Peter';
}


function moveCard() {
    var table;
    if(hrac==1)
        {
        table=document.getElementById("table1");
        }
    else
    {
      table=document.getElementById("tabl");
    }
            var row1=Math.floor(turn1/10);
            var col1=turn1%10;
            var row2=Math.floor(turn2/10);
            var col2=turn2%10;
            var imageSource="img"+field[row1][col1]+".png";
            var imageId="img"+row1+col1;
            document.getElementById(imageId).src="img/pexeso_logo.jpeg";
            imageId="img"+row2+col2;
            document.getElementById(imageId).src="img/pexeso_logo.jpeg";
            var row=table.insertRow(0);
            var cell= row.insertCell(0);
            cell.innerHTML="<IMG SRC=\""+imageSource+"\" WIDTH=\"100\">";
            
            field[row1][col1]=0;
            field[row2][col2]=0;
    
    turn1=-1;
    turn2=-1;
}

function updateScore(){
    if(hrac==1)
        {
            document.getElementById("score1").innerHTML = "Score: "+score1;
        }
    else{
        document.getElementById("score2").innerHTML=  "Score: "+score2;
    }
}

function finishGame(){

}
var hrac=1;
var score1=0;
var score2=0;    
var turn1=-1;
var turn2=-1;
var turnGuessed;
var field = [ [1,1,2,2,], [3,3,4,4,], [5,5,6,6], [7,7,8,8] ];
shuffle();

function shuffle() {
    
    var i, temp;
    for(i=0;i<30;i++)
        {
            var r1=Math.floor(Math.random()*4);
            var c1=Math.floor(Math.random()*4);
            var r2=Math.floor(Math.random()*4);
            var c2=Math.floor(Math.random()*4);  
            temp = field[r1][c1];
            field[r1][c1] = field[r2][c2];
            field[r2][c2] = temp;
        }
    console.log("Pokartovane! "+field);
       
}

function clickImg(value) {
    if(turn2!=-1)
        return;
    var row=Math.floor(value/10);
    var col=value%10;
    
    if(field[row][col]==0)
        return;
    
    console.log("Stlacil si: row: "+row+" col: "+col);
    if(turn1==row*10+col)
        return;
    
    if(field[row][col]>0){  
        var source="img/img"+field[row][col]+".png";
        var imageId="img"+row+col;
        document.getElementById(imageId).src=source;        
    }
    
    if(turn1==-1)
        turn1=row*10+col;
    else {
        turn2=row*10+col;
        chceckSelectedCards(0);
    }
}

function chceckSelectedCards() {
    var row1=Math.floor(turn1/10);
    var col1=turn1%10;
    var row2=Math.floor(turn2/10);
    var col2=turn2%10;
    
    if(field[row1][col1]==field[row2][col2]) {
        //good
        if(hrac==1) {
            score1++;
        }
        else {
            score2++;
        }
        turnGuessed=turn1;
        setTimeout(moveCard,1500);
        updateScore();
    }
    else {
       //not good
        setTimeout(turnBack,2000);
        hrac=hrac==1?2:1;
    }
}

function turnBack() {
    var row1=Math.floor(turn1/10);
    var col1=turn1%10;
    var row2=Math.floor(turn2/10);
    var col2=turn2%10;
    var imageId="img"+row1+col1;
    document.getElementById(imageId).src="img/pexeso_logo.jpeg";
    var imageId="img"+row2+col2;
    document.getElementById(imageId).src="img/pexeso_logo.jpeg";
    turn1=-1;
    turn2=-1;
}

function moveCard() {
    var table;
    if(hrac==1){
        table=document.getElementById('tableP1');
    }
    else {
        table=document.getElementById('tableP2');
    }
    
    var row1=Math.floor(turn1/10);
    var col1=turn1%10;
    var row2=Math.floor(turn2/10);
    var col2=turn2%10;
    var imageSource="img/img"+field[row1][col1]+".jpg";
    
    var imageId="img"+row1+col1;
    document.getElementById(imageId).src="img/blank.png";
    
    var imageId="img"+row2+col2;
    document.getElementById(imageId).src="img/blank.png";
    var row = table.insertRow(0);
    field[row1][col1]=0;
    field[row2][col2]=0;
    
    turn1=-1;
    turn2=-1;
}

function updateScore() {
    if(hrac==1) {
        document.getElementById('score1').innerHTML="Score : "+score1;
    }
    else{
        document.getElementById('score2').innerHTML="Score : "+score2;
    }
}

$("#reset").click(function(){
        location.reload();
    });

$( "document" ).ready(function() {
  if (typeof(Storage) !== "undefined") 
  {
        var value;
      if(localStorage.visited)
            {
                value=localStorage.getItem("visited");
                value++;
                localStorage.visited=value;
            }
        else 
            {
                localStorage.setItem("visited", "1");
                value=1;
            }
        document.getElementById('visited').innerHTML="Number of visitors: "+value;
    // Code for localStorage/sessionStorage.
  } 
  else 
  {
      // Sorry! No Web Storage support..
  }