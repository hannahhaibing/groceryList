package com.svgs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class GroceryListController {

    @FXML
    private TextField allRecipesLabel;

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
    private TextField groceryListLabel;

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
    private TextField promptTitleLabel;

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
    private TextField suggestedRecipesLabel;

    @FXML
    private TextField titleLabel;

    @FXML
    private Label totalPriceLabel;

    @FXML
    private Label unsureLabel;

    @FXML
    private ImageView yellowFinalRecipeBackground;

    @FXML
    private Label yesLabel;

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

    }

    @FXML
    void clickedButtonD(ActionEvent event) {

    }

    @FXML
    void clickedButtonA(ActionEvent event) {

    }

    @FXML
    void clickedButtonB(ActionEvent event) {

    }

    @FXML
    void clickedButtonC(ActionEvent event) {

    }

    @FXML
    void clickedNextRecipeButton(ActionEvent event) {

    }

    @FXML
    void clickedNextSuggestedRecipeButton(ActionEvent event) {

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
    }

}
