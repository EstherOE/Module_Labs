public void draw(Canvas canvas, int x, int y, int rotation) {

        // Please write your code after this line
   int selfType = this.getType();
       String imgUrl = "";
       
       //  set image url to show choice
       if (selfType == 0) imgUrl = "rock.png";
       if (selfType == 1) imgUrl = "paper.png";
       if (selfType == 2 ) imgUrl = "scissors.png";
       
       //  create image of choice and draw to canvas
       ColorImage img = new ColorImage(imgUrl);
       img.setRotation(rotation);
       canvas.add(img, x, y);

}
