package Factory;

public class LabelFactory {



    public static class Builder{
        public Builder(){}

        //region c-tor
        public LabelFactory_ZPL.Builder instanceOfZPL_Builder(){
            return new LabelFactory_ZPL.Builder();
        }
        //endregion
    }
}
