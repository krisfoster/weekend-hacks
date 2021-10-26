package candy;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

@Controller("/")
public class RequestController {

    private static String status = "green";
    private static Integer speed = 0;
    private static Boolean gimme = Boolean.FALSE;

    @Get(uri="/candy", produces=MediaType.APPLICATION_JSON)
    public Message candy() {
        gimme = Boolean.TRUE;
        return new Message(null, status, null);
    }

    @Get(uri="/query", produces=MediaType.APPLICATION_JSON)
    public Message query() {
        gimme = Boolean.TRUE;
        return new Message(speed, status, null); 
    }

    @Post(uri="/auto", consumes=MediaType.APPLICATION_JSON, produces=MediaType.TEXT_HTML)
    public void auto(Message message) {
        speed = message.speed();
        System.out.println(speed);
    }

    @Post(uri="/whattodo", consumes=MediaType.APPLICATION_JSON, produces=MediaType.APPLICATION_JSON)
    public Message whattodo(Message message) {
        status = message.status();
        Message response = new Message(null, null, gimme);
        gimme = Boolean.TRUE;
        return response;
    }
}