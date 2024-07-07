public class Complex2 {
    private int re, im;

    public Complex2(int re, int im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(!(o instanceof Complex2)){
            return false;
        }
        Complex2 c = (Complex2) o;

        return Integer.compare(re,c.re)==0 && Integer.compare(im,c.im)==0;
    }
    @Override
    public int hashCode(){
        int result = Integer.hashCode(im);
        result = 31*result + Integer.hashCode(re);
        return result;
    }
}
