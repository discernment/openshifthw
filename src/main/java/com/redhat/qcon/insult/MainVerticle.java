package com.redhat.qcon.insult;

import io.vertx.core.Future;
//Be careful to use the appropriate import here:
import io.vertx.core.json.JsonObject;
import io.vertx.reactivex.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start(Future<Void> startFuture) {
        startFuture.complete();

      vertx.executeBlocking(future -> {
 // Make our JNDI calls here!
// future.complete(result);
      }, result -> {
// Handle the results of the blocking operation once it completes.
      });

//        vertx.executeBlocking(future->
//                {
//                    
//                    //future.complete(result);
//                },
//                result->-]{
//                        
//        }
//        );
        
//        vertx.eventBus()
//                .consumer("ping-timer")
//                .toFlowable()
//                .doOnEach(m->System.out.println(m.getValue().body()))
//                .subscribe(m->m.reply(new JsonObject().put("action","PONG")));
//        
//        vertx.timerStream(300)
//                .toObservable()
//                .map(t->new JsonObject().put("action","PING"))
//                .subscribe(ping ->vertx.eventBus()
//                        .rxSend("ping-timer",ping)
//                        .subscribe(m->System.out.println(m.body()))
//                );
//        
//        
    }

}
