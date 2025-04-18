package com.svgs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class GroceryListController {

    @FXML
    private Label allRecipesLabel;

    @FXML
    private ImageView blueNoPromptBackground;

    @FXML
    private Button buttonA;

    @FXML
    private Button buttonB;

    @FXML
    private Button buttonC;

    @FXML
    private Button buttonD;

    @FXML
    private ImageView greenSuggestedRecipesBackground;

    @FXML
    private Label groceryListLabel;

    @FXML
    private Label ingredientsAndPricesLabel;

    @FXML
    private Label maybeLabel;

    @FXML
    private Button nextRecipeButton;

    @FXML
    private Button nextSuggestedRecipeButton;

    @FXML
    private Label noLabel;

    @FXML
    private Label numberOfSelectedLabel;

    @FXML
    private ImageView pinkPromptBackground;

    @FXML
    private Label promptTitleLabel;

    @FXML
    private Label questionLabel;

    @FXML
    private Label recipeIngredientsLabel;

    @FXML
    private Label recipeNameLabel;

    @FXML
    private Label recipeStepsLabel;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Label selectFiveLabel;

    @FXML
    private Button selectRecipeButton;

    @FXML
    private Button startWithPromptsButton;

    @FXML
    private Button startWithoutPromptsButton;

    @FXML
    private ImageView startingBackground;

    @FXML
    private Label suggestedRecipeIngredientsLabel;

    @FXML
    private Label suggestedRecipeNameLabel;

    @FXML
    private Label suggestedRecipeStepsLabel;

    @FXML
    private Label suggestedRecipesLabel;

    @FXML
    private Label titleLabel;

    @FXML
    private Label totalPriceLabel;

    @FXML
    private Label unsureLabel;

    @FXML
    private ImageView yellowFinalRecipeBackground;

    @FXML
    private Label yesLabel;

    @FXML
    private int counter;
  
    @FXML
    private ArrayList<Integer> questionCounter;

    @FXML 
    private int suggestedRecipeCounter;

    @FXML
    private int recipeCounter;

    @FXML
    private Button groceryListButton;

    @FXML
    private String [] recipeText;

    @FXML void initialize(){
        startingBackground.setVisible(true);
        titleLabel.setVisible(true);
        startWithPromptsButton.setVisible(true);
        startWithoutPromptsButton.setVisible(true);
        pinkPromptBackground.setVisible(false);
        blueNoPromptBackground.setVisible(false);
        buttonA.setVisible(false);
        buttonB.setVisible(false);
        buttonC.setVisible(false);
        buttonD.setVisible(false);
        greenSuggestedRecipesBackground.setVisible(false);
        groceryListLabel.setVisible(false);
        ingredientsAndPricesLabel.setVisible(false);
        maybeLabel.setVisible(false);
        nextRecipeButton.setVisible(false);
        nextSuggestedRecipeButton.setVisible(false);
        noLabel.setVisible(false);
        numberOfSelectedLabel.setVisible(false);
        pinkPromptBackground.setVisible(false);
        promptTitleLabel.setVisible(false);
        questionLabel.setVisible(false);
        recipeIngredientsLabel.setVisible(false);
        recipeNameLabel.setVisible(false);
        recipeStepsLabel.setVisible(false);
        returnHomeButton.setVisible(false);
        selectFiveLabel.setVisible(false);
        selectRecipeButton.setVisible(false);
        suggestedRecipeIngredientsLabel.setVisible(false);
        suggestedRecipeNameLabel.setVisible(false);
        suggestedRecipeStepsLabel.setVisible(false);
        suggestedRecipesLabel.setVisible(false);
        totalPriceLabel.setVisible(false);
        unsureLabel.setVisible(false);
        yellowFinalRecipeBackground.setVisible(false);
        yesLabel.setVisible(false);
        allRecipesLabel.setVisible(false);
        groceryListButton.setVisible(false);
        questionCounter = new ArrayList<Integer>(); //will set up with {0,1,2,3} for question numbers
        questionCounter.add(0);
        questionCounter.add(1);
        questionCounter.add(2);
        questionCounter.add(3);
    }

    @FXML
    void clickedButtonD(ActionEvent event) { //unsure //q0 budget, q1 cook time, q2 health, q3 portion size, will be 9
      //  unsureCounter = unsureCounter+1;
        if(counter==0){
            questionCounter.add(1,9);
        } else if(counter==1){
            questionCounter.add(2,9);
        } else if(counter==2){
            questionCounter.add(3,9);
        } else {
            questionCounter.add(9);
        }
        counter++;
        cycleQuestions();
    }

    @FXML
    void clickedButtonA(ActionEvent event) { //yes, will be 6
      //  yesCounter = yesCounter+1;
      if(counter==0){
        questionCounter.add(1,6);
    } else if(counter==1){
        questionCounter.add(2,6);
    } else if(counter==2){
        questionCounter.add(3,6);
    } else {
        questionCounter.add(6);
    }
        counter++;
        cycleQuestions();
    }

    @FXML
    void clickedButtonB(ActionEvent event) { //no, will be 7
      //  noCounter = noCounter+1;
      if(counter==0){
        questionCounter.add(1,7);
    } else if(counter==1){
        questionCounter.add(2,7);
    } else if(counter==2){
        questionCounter.add(3,7);
    } else {
        questionCounter.add(7);
    }
        counter++;
        cycleQuestions();
    }

    @FXML
    void clickedButtonC(ActionEvent event) { //maybe, will be 8
      //  maybeCounter = maybeCounter+1;
      if(counter==0){
        questionCounter.add(1,8);
    } else if(counter==1){
        questionCounter.add(2,8);
    } else if(counter==2){
        questionCounter.add(3,8);
    } else {
        questionCounter.add(8);
    }
        counter++;
        cycleQuestions();
    }

    @FXML
    void clickedGroceryListButton(ActionEvent event) {
        blueNoPromptBackground.setVisible(false);
        allRecipesLabel.setVisible(false);
        selectFiveLabel.setVisible(false);
        recipeIngredientsLabel.setVisible(false);
        nextRecipeButton.setVisible(false);
        recipeStepsLabel.setVisible(false);
        selectRecipeButton.setVisible(false);
        recipeNameLabel.setVisible(false);
        numberOfSelectedLabel.setVisible(false);
        groceryListButton.setVisible(true);
        yellowFinalRecipeBackground.setVisible(true);
        returnHomeButton.setVisible(true);
        ingredientsAndPricesLabel.setVisible(true);
        totalPriceLabel.setVisible(true);
        groceryListLabel.setVisible(true);
    }

    @FXML
    void clickedReturnHomeButton(ActionEvent event){
        startingBackground.setVisible(true);
        titleLabel.setVisible(true);
        startWithPromptsButton.setVisible(true);
        startWithoutPromptsButton.setVisible(true);
        pinkPromptBackground.setVisible(false);
        blueNoPromptBackground.setVisible(false);
        buttonA.setVisible(false);
        buttonB.setVisible(false);
        buttonC.setVisible(false);
        buttonD.setVisible(false);
        greenSuggestedRecipesBackground.setVisible(false);
        groceryListLabel.setVisible(false);
        ingredientsAndPricesLabel.setVisible(false);
        maybeLabel.setVisible(false);
        nextRecipeButton.setVisible(false);
        nextSuggestedRecipeButton.setVisible(false);
        noLabel.setVisible(false);
        numberOfSelectedLabel.setVisible(false);
        pinkPromptBackground.setVisible(false);
        promptTitleLabel.setVisible(false);
        questionLabel.setVisible(false);
        recipeIngredientsLabel.setVisible(false);
        recipeNameLabel.setVisible(false);
        recipeStepsLabel.setVisible(false);
        returnHomeButton.setVisible(false);
        selectFiveLabel.setVisible(false);
        selectRecipeButton.setVisible(false);
        suggestedRecipeIngredientsLabel.setVisible(false);
        suggestedRecipeNameLabel.setVisible(false);
        suggestedRecipeStepsLabel.setVisible(false);
        suggestedRecipesLabel.setVisible(false);
        totalPriceLabel.setVisible(false);
        unsureLabel.setVisible(false);
        yellowFinalRecipeBackground.setVisible(false);
        yesLabel.setVisible(false);
        allRecipesLabel.setVisible(false);
        groceryListButton.setVisible(false);

    }

    @FXML
    void clickedNextRecipeButton(ActionEvent event) {
            recipeNameLabel.setText(recipeText[recipeCounter].split("\\*")[0]);
            recipeStepsLabel.setText(recipeText[recipeCounter].split("\\*")[1]);
            String ingredients = "";
            for(String each:recipeText[recipeCounter].split("\\*")[2].split(",")){
                ingredients+=each+"\n";
            }
            recipeIngredientsLabel.setText(ingredients);
        if(recipeCounter<=8){
            recipeCounter++;
        } else {
            recipeCounter=0;
            cycleRecipes();
        }
    }

    @FXML
    void clickedNextSuggestedRecipeButton(ActionEvent event) {
        suggestedRecipeNameLabel.setText(recipeText[suggestedRecipeCounter].split("\\*")[0]);
        suggestedRecipeStepsLabel.setText(recipeText[suggestedRecipeCounter].split("\\*")[1]);
        String ingredients = "";
        for(String each : recipeText[suggestedRecipeCounter].split("\\*")[2].split(",")){
            ingredients+=each + "\n";
        }
        suggestedRecipeIngredientsLabel.setText(ingredients);

        if(suggestedRecipeCounter<=6){
              suggestedRecipeCounter++;
        } else {
            suggestedRecipeCounter=0;
            cycleRecipes();
        }


    }

    @FXML
    void clickedSelectRecipeButton(ActionEvent event) {

    }

    @FXML
    void clickedStartWithoutPrompts(ActionEvent event) {
        startingBackground.setVisible(false);
        titleLabel.setVisible(false);
        startWithPromptsButton.setVisible(false);
        startWithoutPromptsButton.setVisible(false);
        blueNoPromptBackground.setVisible(true);
        allRecipesLabel.setVisible(true);
        selectFiveLabel.setVisible(true);
        recipeIngredientsLabel.setVisible(true);
        nextRecipeButton.setVisible(true);
        recipeStepsLabel.setVisible(true);
        selectRecipeButton.setVisible(true);
        recipeNameLabel.setVisible(true);
        numberOfSelectedLabel.setVisible(true);

        cycleRecipes();

    }

    @FXML
    void clickedStartWithPrompts(ActionEvent event){
        startingBackground.setVisible(false);
        titleLabel.setVisible(false);
        startWithPromptsButton.setVisible(false);
        startWithoutPromptsButton.setVisible(false);
        pinkPromptBackground.setVisible(true);
        promptTitleLabel.setVisible(true);
        questionLabel.setVisible(true);
        buttonA.setVisible(true);
        yesLabel.setVisible(true);
        buttonB.setVisible(true);
        noLabel.setVisible(true);
        buttonC.setVisible(true);
        maybeLabel.setVisible(true);
        buttonD.setVisible(true);
        unsureLabel.setVisible(true);

        cycleQuestions();
    }

    @FXML
    void cycleQuestions(){
        if(counter==0){
            questionLabel.setText("Are you working with a tight food budget this week?");
        } else if(counter==1){
            questionLabel.setText("Do you have time to cook meals most days this week?");
        } else if(counter==2){
            questionLabel.setText("Are you aiming to eat healthier this week?");
        } else if(counter==3){
            questionLabel.setText("Are you feeding others, like family or roomates, this week?");
        } else {
            counter=0;
            pinkPromptBackground.setVisible(false);
            promptTitleLabel.setVisible(false);
            questionLabel.setVisible(false);
            buttonA.setVisible(false);
            yesLabel.setVisible(false);
            buttonB.setVisible(false);
            noLabel.setVisible(false);
            buttonC.setVisible(false);
            maybeLabel.setVisible(false);
            buttonD.setVisible(false);
            unsureLabel.setVisible(false);
            greenSuggestedRecipesBackground.setVisible(true);
            suggestedRecipesLabel.setVisible(true);
            suggestedRecipeIngredientsLabel.setVisible(true);
            nextSuggestedRecipeButton.setVisible(true);
            suggestedRecipeStepsLabel.setVisible(true);
            suggestedRecipeNameLabel.setVisible(true);
            groceryListButton.setVisible(true);
            cycleRecipes();
        }
    }

    @FXML
    void cycleRecipes(){
        File recipes = new File("src\\main\\resources\\com\\svgs\\recipes.txt");
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(recipes));
            String allData = "";
            while(reader.ready()) {
                allData += reader.readLine()+"\n";
            }
            recipeText = allData.split("\\*\\*\\*");

            reader.close();    

            if(greenSuggestedRecipesBackground.isVisible()){
                suggestedRecipeNameLabel.setText(recipeText[suggestedRecipeCounter].split("\\*")[0]);
                suggestedRecipeStepsLabel.setText(recipeText[suggestedRecipeCounter].split("\\*")[1]);
                String ingredients = "";
                for(String each : recipeText[suggestedRecipeCounter].split("\\*")[2].split(",")){
                    ingredients+=each + "\n";
                }
                suggestedRecipeIngredientsLabel.setText(ingredients);
                        suggestedRecipeCounter++;
                    }

            if(blueNoPromptBackground.isVisible()){
                recipeNameLabel.setText(recipeText[recipeCounter].split("\\*")[0]);
                recipeStepsLabel.setText(recipeText[recipeCounter].split("\\*")[1]);
                String ingredients = "";
            for(String each:recipeText[recipeCounter].split("\\*")[2].split(",")){
                ingredients+=each+"\n";
            }
            recipeIngredientsLabel.setText(ingredients);
                        recipeCounter++;
                    }

        } catch(Exception e){
            System.out.println(e);
    } 
    }
}