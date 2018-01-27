public int compareWith(Choice anotherChoice) {

        // Please write your code after this line
   int result;
        int selfType = this.getType();
        int anotherType = anotherChoice.getType();
        
        // write your code after this line
        //  set compare result
        if ( selfType == 0 && anotherType == 0 ||
             selfType == 1 && anotherType == 1 ||
             selfType == 2 && anotherType == 2 ) 
        {
            result = 0;
        } 
        else if ( selfType == 0 && anotherType == 1 ||
                  selfType == 1 && anotherType == 2 ||
                  selfType == 2 && anotherType == 0 ) 
        {
            result = -1;
        }
        else {
            result = 1;
        }
        
        return result;
        }
