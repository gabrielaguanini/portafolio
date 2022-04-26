let num = 0;
let invervalosegundos= 1000;

function adelante(){
   num++;
    if(num>5){
       return num=1;}
       else {
        let foto = document.getElementById("foto");
        foto.src = "./Imagenes/img/img"+num+".jpg";}
    
}

function atras(){
    num--;
    if(num<1){
    return num=5;}
    else{    
    let foto = document.getElementById("foto");
    foto.src = "img/img" +num+ ".jpg";}  
    }


window.onload = function reproduccionAutomatica(){
     
    adelante_automatico=setInterval(adelante, invervalosegundos);}

function desactivarreproduccionAutomatica(){
    clearInterval(adelante_automatico);
    
}
document.getElementById("animacionacercade").animate([
    
    { transform: 'translateY(0px)' },
    { transform: 'translateY(-600px)' }
  ], {
    
    duration: 6000,
    
  });

  

 
   