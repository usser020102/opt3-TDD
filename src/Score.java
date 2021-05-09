public class Score {

    public boolean vrijeWorp(Integer score, boolean fout){
    if((score == 2) && (fout == true)){
    return true;
    }
    else if((score == 2) && (fout == false)){
        return false;
    }
    if((score == 3) && (fout == true)){
        return true;
    }
    else if((score == 3) && (fout == false)){
        return false;
    }
    return false;
    }
}
