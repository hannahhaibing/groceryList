package com.svgs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
    private Label groceryRecipeNameLabel;

    @FXML
    private Label totalPriceLabel;

    @FXML
    private Label unsureLabel;

    @FXML
    private Label tPrice;

    @FXML
    private ImageView yellowFinalRecipeBackground;

    @FXML
    private Label yesLabel;

    @FXML
    private int counter;
  
    @FXML
    private ArrayList<Integer> questionCounter;

    @FXML
    private ArrayList<Integer> suggestedIngredientsIndex;

    @FXML 
    private int suggestedRecipeCounter;

    @FXML
    private int recipeCounter;

    @FXML
    private int selectedCounter;

    @FXML
    private int groceryListCounter;

    @FXML
    private Button groceryListButton;

    @FXML
    private Button nextListButton;

    @FXML
    private String [] recipeText;

    @FXML
    private String [] ingredientList;

    @FXML
    private String [] costList;

    @FXML
    private ArrayList<Integer> selectedRecipes;

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
        groceryRecipeNameLabel.setVisible(false);
        unsureLabel.setVisible(false);
        yellowFinalRecipeBackground.setVisible(false);
        yesLabel.setVisible(false);
        allRecipesLabel.setVisible(false);
        groceryListButton.setVisible(false);
        totalPriceLabel.setVisible(false);
        nextListButton.setVisible(false);
        tPrice.setVisible(false);
        questionCounter = new ArrayList<Integer>(); //will set up
        selectedRecipes = new ArrayList<Integer>();
        suggestedIngredientsIndex = new ArrayList<>();
        ingredientList = new String [0];
        costList = new String [0];
    }

    @FXML
    void clickedButtonD(ActionEvent event) { //unsure //q0 budget, q1 cook time, q2 health, q3 portion size, will be 7
        if(counter==0 || counter==1 || counter==2 || counter==3){
            questionCounter.add(7);
        }
        counter++;
        cycleQuestions();
    }

    @FXML
    void clickedButtonA(ActionEvent event) { //yes, will be 6
        if(counter==0 || counter==1 || counter==2 || counter==3){
            questionCounter.add(6);
        }
        counter++;
        cycleQuestions();
    }

    @FXML
    void clickedButtonB(ActionEvent event) { //no, will be 7
        if(counter==0 || counter==1 || counter==2 || counter==3){
            questionCounter.add(7);
        }
        counter++;
        cycleQuestions();
    }

    @FXML
    void clickedButtonC(ActionEvent event) { //maybe, will be 6
        if(counter==0 || counter==1 || counter==2 || counter==3){
            questionCounter.add(6);
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
        groceryRecipeNameLabel.setVisible(true);
        groceryListLabel.setVisible(true);
        totalPriceLabel.setVisible(true);
        nextListButton.setVisible(true);
        tPrice.setVisible(true);

        if(selectedRecipes==null || selectedRecipes.isEmpty()){
        String ingredients = "";
        ingredientList = recipeText[suggestedIngredientsIndex.get(groceryListCounter)].split("\\*")[2].split(",");
        costList = recipeText[suggestedIngredientsIndex.get(groceryListCounter)].split("\\*")[4].split(",");

            for(int i = 0; i<ingredientList.length && i < costList.length; i++){
                ingredients+= ingredientList[i].trim() + ": $"+ costList[i].trim() + "\n";
            }
        ingredientsAndPricesLabel.setText(ingredients);
        totalPriceLabel.setText(recipeText[suggestedIngredientsIndex.get(groceryListCounter)].split("\\*")[5]);
        groceryRecipeNameLabel.setText(recipeText[suggestedIngredientsIndex.get(groceryListCounter)].split("\\*")[0]);
        groceryListCounter++;
        }
    }

    @FXML
    void clickedNextListButton(ActionEvent event){
        if(selectedRecipes==null || selectedRecipes.isEmpty()){
        if(groceryListCounter>=suggestedIngredientsIndex.size()){
            groceryListCounter = 0;
        }
        String ingredients = "";
        ingredientList = recipeText[suggestedIngredientsIndex.get(groceryListCounter)].split("\\*")[2].split(",");
        costList = recipeText[suggestedIngredientsIndex.get(groceryListCounter)].split("\\*")[4].split(",");
            for(int i = 0; i<ingredientList.length && i < costList.length; i++){
                ingredients+= ingredientList[i].trim() + ": $"+ costList[i].trim() + "\n";
            }
        ingredientsAndPricesLabel.setText(ingredients);
        totalPriceLabel.setText(recipeText[suggestedIngredientsIndex.get(groceryListCounter)].split("\\*")[5]);
        groceryRecipeNameLabel.setText(recipeText[suggestedIngredientsIndex.get(groceryListCounter)].split("\\*")[0]);
        groceryListCounter++;
        } else {
            if(groceryListCounter>=selectedRecipes.size()){
                groceryListCounter = 0;
            }
            String ingredients = "";
        ingredientList = recipeText[selectedRecipes.get(groceryListCounter)].split("\\*")[2].split(",");
        costList = recipeText[selectedRecipes.get(groceryListCounter)].split("\\*")[4].split(",");

            for(int i = 0; i<ingredientList.length && i < costList.length; i++){
                ingredients+= ingredientList[i].trim() + ": $"+ costList[i].trim() + "\n";
            }
        ingredientsAndPricesLabel.setText(ingredients);
        totalPriceLabel.setText(recipeText[selectedRecipes.get(groceryListCounter)].split("\\*")[5]);
        groceryRecipeNameLabel.setText(recipeText[selectedRecipes.get(groceryListCounter)].split("\\*")[0]);
        groceryListCounter++;
        }
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
        groceryRecipeNameLabel.setVisible(false);
        unsureLabel.setVisible(false);
        tPrice.setVisible(false);
        yellowFinalRecipeBackground.setVisible(false);
        yesLabel.setVisible(false);
        allRecipesLabel.setVisible(false);
        groceryListButton.setVisible(false);
        nextListButton.setVisible(false);
        totalPriceLabel.setVisible(false);
        selectedRecipes.clear();
        questionCounter.clear();
        suggestedIngredientsIndex.clear();
        ingredientList = new String [0];
        costList = new String [0];
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
   
            recipeCounter++;
        
         if(recipeCounter==20){
            recipeCounter=0;
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

              suggestedRecipeCounter++;
        if(suggestedRecipeCounter==20){
            suggestedRecipeCounter=0;
        } 
        cycleRecipes();


    }

    @FXML
    void clickedSelectRecipeButton(ActionEvent event) {
        if(selectedCounter!=4){
        selectedCounter++;
        numberOfSelectedLabel.setText("Selected: " + selectedCounter);
        selectedRecipes.add(recipeCounter);
        } else {
            numberOfSelectedLabel.setText("Selected: ");
            selectedCounter=0;
            blueNoPromptBackground.setVisible(true);
            allRecipesLabel.setVisible(true);
            selectFiveLabel.setVisible(true);
            recipeIngredientsLabel.setVisible(true);
            nextRecipeButton.setVisible(true);
            recipeStepsLabel.setVisible(true);
            selectRecipeButton.setVisible(true);
            recipeNameLabel.setVisible(true);
            numberOfSelectedLabel.setVisible(true);
            groceryListButton.setVisible(true);
            yellowFinalRecipeBackground.setVisible(true);
            returnHomeButton.setVisible(true);
            ingredientsAndPricesLabel.setVisible(true);
            groceryRecipeNameLabel.setVisible(true);
            groceryListLabel.setVisible(true);
            totalPriceLabel.setVisible(true);
            nextListButton.setVisible(true);
            tPrice.setVisible(true);
            String ingredients = "";
        ingredientList = recipeText[selectedRecipes.get(groceryListCounter)].split("\\*")[2].split(",");
        costList = recipeText[selectedRecipes.get(groceryListCounter)].split("\\*")[4].split(",");

            for(int i = 0; i<ingredientList.length && i < costList.length; i++){
                ingredients+= ingredientList[i].trim() + ": $"+ costList[i].trim() + "\n";
            }
        ingredientsAndPricesLabel.setText(ingredients);
        totalPriceLabel.setText(recipeText[selectedRecipes.get(groceryListCounter)].split("\\*")[5]);
        groceryRecipeNameLabel.setText(recipeText[selectedRecipes.get(groceryListCounter)].split("\\*")[0]);
        groceryListCounter++;
        }

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
                String selections = questionCounter.get(0).toString() + questionCounter.get(1).toString() + questionCounter.get(2).toString() + questionCounter.get(3).toString();
                if(recipeText[suggestedRecipeCounter].split("\\*")[3].indexOf(selections)==-1){
                    suggestedRecipeCounter++;
                    if(suggestedRecipeCounter==20){
                        suggestedRecipeCounter=0;
                    } 
                        cycleRecipes();
                    return;
                }
                suggestedIngredientsIndex.add(suggestedRecipeCounter);
                suggestedRecipeNameLabel.setText(recipeText[suggestedRecipeCounter].split("\\*")[0]);
                suggestedRecipeStepsLabel.setText(recipeText[suggestedRecipeCounter].split("\\*")[1]);
                String ingredients = "";
                for(String each : recipeText[suggestedRecipeCounter].split("\\*")[2].split(",")){
                    ingredients+=each + "\n";
                }
                suggestedRecipeIngredientsLabel.setText(ingredients);
                }

            if(blueNoPromptBackground.isVisible()){
                selectedRecipes.add(recipeCounter);
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

/*
6666 - 5
6667 - 5
6676 - 5
6677 - 5
6766 - 5
6767 - 5
6776 - 5
6777 - 5
7666 - 5
7667 - 5
7676 - 5
7677 - 5
7766 - 5
7767 - 5
7776 - 5
7777 - 5

  chicken ceasar salad: 6,7,6,6
                        6,7,6,7
                        6,6,6,7
  chicken broccoli rice casserole: 6,6,6,6
                                   6,6,7,6
  baked feta pasta: 6,6,7,6
                    6,6,6,6
                    6,6,6,7
                    6,6,7,7
  shrimp quesadilla: 6,7,7,6
                     6,7,7,7
                     6,7,6,6
                     6,6,6,7
                     6,6,7,6
                     6,6,7,7
                     6,7,6,7
                     7,7,7,7
  chicken spinach pasta: 7,6,7,6
                         7,6,7,7
                         7,7,6,6
                         7,7,6,7
                         7,7,7,6
                         7,7,7,7
  slow-cooker spareribs: 7,7,6,6
                         7,6,6,6
                         7,6,6,7
                         7,6,7,6
                         7,6,7,7
                         7,7,6,7
                         7,7,7,6
  rosemary salmon and veggies: 7,7,6,7
                               7,7,6,6
  shrimp with orzo and feta: 7,7,6,6
                             7,6,6,6
                             7,6,6,7
                             7,7,6,7
  easy beef and noodles: 7,7,7,7
  greek chicken and rice: 7,6,6,6
                          7,6,6,7
  smoked sausage and pasta: 7,7,7,6
                            6,7,7,6
                            6,7,7,7
  pork chops with parmesan sauce: 7,6,6,6
                                  7,6,6,7
  shrimp noodle bowls: 6,7,6,7
                       6,6,6,7
                       6,6,7,7
                       6,7,6,6
                       6,7,7,6
                       6,7,7,7
  ravioli lasagna: 7,6,7,6
                   7,6,7,7
                   7,7,7,6
                   7,7,7,7
  mom's spanish rice: 6,7,6,6 
                      6,6,6,6
                      6,6,7,6
                      6,6,7,7
                      6,7,6,7
                      6,7,7,6
                      6,7,7,7
  salsa verde chicken casserole: 7,6,7,6
                                 7,6,7,7
                                 7,7,7,6
                                 7,7,7,7
  broiled chicken and artichokes: 7,7,6,6
                                  6,7,6,6
                                  7,6,6,6
                                  7,6,6,7
                                  7,7,6,7
  skillet chicken tortellini alfredo: 7,6,7,6
                                      7,6,7,7
  egg roll in a bowl: 6,6,6,6
                      6,6,6,7
                      6,6,7,6
                      6,6,7,7
                      6,7,6,7
                      6,7,7,6
                      6,7,7,7
  roasted cauliflower soup: 6,6,6,6

*/
