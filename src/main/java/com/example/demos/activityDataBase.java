package com.example.demos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Scope("singleton")
public class activityDataBase {
    private List<Activity> activityList = new ArrayList<>();
    private int acticityCounter = 1;

    public void addActivity(Activity activity)
    {
        activity.setId(acticityCounter);
        activityList.add(activity);
        acticityCounter++;
    }

    public List<Activity> getActivityList() {

        return activityList;
    }
    public List<Activity> getActivityList(Integer ECTS, String name, Integer room, String exam)
        {
            if (ECTS==null && name==null && room==null && exam==null) {
                return activityList;
            }
            List<Activity> filteredActivities = new ArrayList<>(activityList);
            if (ECTS != null) {
                filteredActivities = filteredActivities.stream()
                        .filter(e -> e.getECTS().equals(ECTS))
                        .collect(Collectors.toList());
            }
            if (name != null) {
                filteredActivities = filteredActivities.stream()
                        .filter(e -> e.getName().equals(name))
                        .collect(Collectors.toList());
            }
            if (room != null) {
                filteredActivities = filteredActivities.stream()
                        .filter(e -> e.getSala().equals(room))
                        .collect(Collectors.toList());
            }
            if (exam != null) {
                filteredActivities = filteredActivities.stream()
                        .filter(e -> e.getExam().equals(exam))
                        .collect(Collectors.toList());
            }

       return filteredActivities;
    }
    public void deleteALL() {
        activityList.clear();
    }
    public void deleteById(Activity id) {
        activityList.remove(id);
    }
    public Activity getActivityById(Integer id){
        for (Activity element : activityList){
            if (element.getId().equals(id)){
                return element;
            }
        }
        return null;
    }
}