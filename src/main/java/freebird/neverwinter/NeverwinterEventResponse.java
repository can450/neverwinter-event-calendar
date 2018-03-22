package freebird.neverwinter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NeverwinterEventResponse {
    private String success;
    private NeverwinterEventData[] data;

    public NeverwinterEventResponse(){}

    public NeverwinterEventData[] getData() {
        return data;
    }

    public void setData(NeverwinterEventData[] data){
        this.data=data;
    }

    public String getSuccess(){
        return this.success;
    }

    public void setSuccess(String success){
        this.success=success;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Success status=" + success + "\n");
        sb.append("Neverwinter Event List by can450\n" +
                "the API can be found in https://www.nwo-uncensored.com/phpBB3/app.php/nwountools/api/calendar\n\n");


        for(int i=0;i<data.length;i++ ){
            sb.append(data[i]);
        }
        return  sb.toString();
    }


}
