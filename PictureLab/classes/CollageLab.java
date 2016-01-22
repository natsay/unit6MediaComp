public class CollageLab 
{
    public static void main(String args[]) 
    {
<<<<<<< HEAD
        Picture canvas= new Picture(1000,2227);
        Picture picture1= new Picture("coolness.jpg");
       
        
        
        Picture newFish2= new Picture(picture1); 
        newFish2.negate();
        newFish2.mirrorVertical();
        newFish2.mirrorHorizontal();
        canvas.copy(newFish2,0,0);
        
        Picture newPic=new Picture(picture1);
        newPic.grayscale();
        canvas.copy(newPic,0,236);
        
        Picture newFish1=new Picture(picture1); 
        newFish1.negate();
        newFish1.zeroBlue();
        newFish1.mirrorVertical();
        newFish1.mirrorHorizontal();
        canvas.copy(newFish1,0,500);
    
        
        
        Picture newPic1=new Picture(picture1);
        canvas.copy(newPic1,0,786);
        
        
        Picture newFish6=new Picture(picture1); 
        newFish6.negate();
        newFish6.keepOnlyBlue();
        newFish6.mirrorVertical();
        newFish6.mirrorVerticalRightToLeft();
        newFish6.mirrorHorizontal();
        canvas.copy(newFish6,0,1075);
        
        
        
        Picture newPic2=new Picture(picture1);
        newPic2.grayscale();
        canvas.copy(newPic2,0,1364);
        
        
        Picture newFish4=new Picture(picture1); 
        newFish4.negate();
        newFish4.keepOnlyRed();
        newFish1.mirrorHorizontalBotToTop();
        canvas.copy(newFish4,0,1651);
        
        Picture newPic3=new Picture(picture1);
        canvas.copy(newPic2,0,1975);
        
        canvas.write("collage.jpg");
        
=======
        Picture picture1= new Picture("coolstuff.jpg");
        Picture picture2= new Picture("coolstuff.jpg"); 
        Picture picture3= new Picture("coolstuff.jpg"); 
        Picture picture4= new Picture("coolstuff.jpg"); 
        Picture picture5= new Picture("coolstuff.jpg"); 
        Picture canvas= new Picture(900,1000);
        
        Picture newFish1= picture1.scaleByHalf(); 
        newFish1.mirrorHorizontal();
        canvas.copy(newFish1,0,0);
    
//         Picture newFish2= picture2.scaleByHalf(); 
//  
//         Picture newFish3= picture3.scaleByHalf();    
//         Picture newFish4= picture4.scaleByHalf(); 
//         Picture newFish5= picture4.scaleByHalf(); 
//         
        canvas.copy(newFish1,0,0);
//         canvas.copy(newFish2,0,285);
//         canvas.copy(newFish3,0,570);
//         canvas.copy(newFish4,0,855);
>>>>>>> origin/master
        canvas.explore();
        
     
        
    }     
<<<<<<< HEAD
}  
=======
}    
>>>>>>> origin/master
