public class CollageLab 
{
    public static void main(String args[]) 
    {
        //creates blank canvas and imports picture
        Picture canvas= new Picture(1000,2227);
        Picture picture1= new Picture("coolness.jpg");
        
        //creates new instance of picture and negates,mirrors vertically and horizontally
        Picture newFish2= new Picture(picture1); 
        newFish2.negate();
        newFish2.mirrorVertical();
        newFish2.mirrorHorizontal();
        canvas.copy(newFish2,0,0);
        
        //creates new instance of picture and grayscales
        Picture newPic=new Picture(picture1);
        newPic.grayscale();
        canvas.copy(newPic,0,236);
        
        //creates new instance of picture negates,add zeroBlue filter,mirrors vertically and horizontally
        Picture newFish1=new Picture(picture1); 
        newFish1.negate();
        newFish1.zeroBlue();
        newFish1.mirrorVertical();
        newFish1.mirrorHorizontal();
        canvas.copy(newFish1,0,500);
    
        
        //creates new instance of picture and copies onto canvas
        Picture newPic1=new Picture(picture1);
        canvas.copy(newPic1,0,786);
        
        //creates new instance of picture negates,add zeroBlue filter,mirrors vertically right to left then horizontally
        Picture newFish6=new Picture(picture1); 
        newFish6.negate();
        newFish6.keepOnlyBlue();
        newFish6.mirrorVertical();
        newFish6.mirrorVerticalRightToLeft();
        newFish6.mirrorHorizontal();
        canvas.copy(newFish6,0,1075);
        
        
        //creates new instance of picture and grayscale filter, copies onto canvas
        Picture newPic2=new Picture(picture1);
        newPic2.grayscale();
        canvas.copy(newPic2,0,1364);
        
        //creates new instance of picture negates,adds keeponlyRed filter,mirrors from bottom to top
        Picture newFish4=new Picture(picture1); 
        newFish4.negate();
        newFish4.keepOnlyRed();
        newFish1.mirrorHorizontalBotToTop();
        canvas.copy(newFish4,0,1651);
        //creates new instance of picture and  copies onto canvas
        Picture newPic3=new Picture(picture1);
        canvas.copy(newPic3,0,1975);
        
        canvas.write("collage.jpg");
        

       

        canvas.explore();
        
     
        
    }     

}  

