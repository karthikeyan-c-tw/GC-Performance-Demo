package gc.test.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class LoadController {

    private static final Random rnd = ThreadLocalRandom.current();
    private static final List<byte[]> survivor = new ArrayList<>();

    @PostMapping("/load")
    public String load() {
        for (int i = 0; i < 10_000; i++) {
            byte[] arr = new byte[1024*10]; // 10KB
            if (rnd.nextInt(100) == 0) { // ~1% survive
                survivor.add(arr);
            }
        }
        if (survivor.size() > 50_000) {
            survivor.clear(); // occasionally clear survivors
        }
        return "Object Allocated";

    }
}
