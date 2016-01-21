public class CollageLab 
{
    public static void main(String args[]) 
    {
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
        canvas.explore();
        
     
        
    }     
}    