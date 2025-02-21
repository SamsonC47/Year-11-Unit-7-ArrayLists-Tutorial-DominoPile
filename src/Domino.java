public class Domino {

    private int top;
    private int bottom;

    public Domino() {
        this.top = 0;
        this.bottom = 0;
    }

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public String toString() {
        return (top + "/" + bottom);
    }

    public void flip() {
        int substitute = top;
        top = bottom;
        bottom = substitute;
    }

    public void settle() {
        if (top > bottom) {
            flip();
        }
    }

    public int compareTo(Domino other) {
        int thisSmallest;
        int otherSmallest;
        int thisBiggest;
        int otherBiggest;
        if (this.top <= this.bottom) {
            thisSmallest = this.top;
        } else {
            thisSmallest = this.bottom;
        }
        if (other.top <= other.bottom) {
            otherSmallest = other.top;
        } else {
            otherSmallest = other.bottom;
        }
        if (thisSmallest < otherSmallest) {
            return -1;
        } else if (thisSmallest > otherSmallest) {
            return 1;
        } else {
            if (this.top >= this.bottom) {
                thisBiggest = this.top;
            } else {
                thisBiggest = this.bottom;
            }
            if (other.top >= other.bottom) {
                otherBiggest = other.top;
            } else {
                otherBiggest = other.bottom;
            }
            if(thisBiggest<otherBiggest){
                return -1;
            } else if (thisBiggest>otherBiggest){
                return 1;
            } else {
                return 0;
            }
        }

    }
    public int compareToWeight(Domino other){
        int thisWeight= this.top+this.bottom;
        int otherWeight= other.top+other.bottom;
        if(thisWeight<otherWeight){
            return -1;
        } else if (thisWeight>otherWeight){
            return 1;
        } else {
            return 0;
        }
    }
    public boolean canConnect(Domino other){
        if(this.top==other.top){
            return true;
        } else if (this.top==other.bottom){
            return true;
        } else if (this.bottom==other.top){
            return true;
        } else if (this.bottom==other.bottom){
            return true;
        } else {
            return false;
        }
    }
}
