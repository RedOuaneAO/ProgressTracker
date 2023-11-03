package services;
import entities.Objective;
import interfaces.Action;
import repositories.ObjectiveRepo;

public class ObjectiveService implements Action {
    private ObjectiveRepo objectiveRepo;

    public ObjectiveService(ObjectiveRepo objectiveRepo) {
        this.objectiveRepo = objectiveRepo;
    }

    @Override
    public Objective addObjective(Objective objective){
        return objective;
    }
    @Override
    public void updateObjective(){

    }

}
