package com.example.demos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.List;


@RestController
@RequestMapping("api")


public class testAPI {

    @Autowired
    private activityDataBase activityDataBase;

    @GetMapping("test")

    public String TestApi()
    {
        return "test";
    }
    @PostMapping(value = "activites",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)

    public void addNewActivity(@RequestBody Activity activity)
    {
        activityDataBase.addActivity(activity);
    }
    @GetMapping(value = "activites",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Activity> getActivites(@Nullable @RequestParam("ECTS") Integer ECTS,
                                       @Nullable @RequestParam("name") String name,
                                       @Nullable @RequestParam("sala") Integer sala,
                                       @Nullable @RequestParam("exam") String exam)
    {
        return activityDataBase.getActivityList(ECTS, name, sala, exam);
    }

    @GetMapping(value = "activites/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getActivityById(@PathVariable("id") Integer id){

        Activity activity = activityDataBase.getActivityById(id);
        if (activity == null){
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok(activity);
        }
    }
    @DeleteMapping(value = "activites/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Integer id){
        Activity activity = activityDataBase.getActivityById(id);
        if (activity == null){
            return ResponseEntity.notFound().build();
        }
        activityDataBase.deleteById(activity);
        return ResponseEntity.ok(activity);
    }
    @DeleteMapping(value = "activites")
    public void deleteAll(){
        activityDataBase.deleteALL();
    }


}
