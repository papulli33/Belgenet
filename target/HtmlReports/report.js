$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/1_login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verification of Login Function",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user on the belgenet page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.the_user_on_the_belgenet_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the Demo button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.the_user_clicks_the_Demo_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the username as \"botcu\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.the_user_enters_the_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the password as \"spider\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.the_user_enters_the_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.the_user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be redirected to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.the_user_should_be_redirected_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/2_create.feature");
formatter.feature({
  "name": "Create document",
  "description": "Create single signatory document",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Open Evrak Olustur page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is logged  in",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Evrak Islemleri button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_on_Evrak_Islemleri_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Evrak Olustur button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_on_Evrak_Olustur_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Evrak Olustur window should open",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_evrak_Olustur_window_should_open()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Fill the Bilgileri part of Evrak Olustur",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the Evrak Olustur page is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_evrak_Olustur_page_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Bilgileri button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Bilgileri_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in the input part of Kaldirilacak Klasorler",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_fills_in_the_input_part_of_Kaldirilacak_Klasorler()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in the input part of Geregi",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_fills_in_the_input_part_of_Geregi()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in the input part of Onay Akisi",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_fills_in_the_input_part_of_Onay_Akisi()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Fill Editor part of Evrak Olustur",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "mandatory sections in the Bilgileri part are filled",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.mandatory_sections_in_the_Bilgileri_part_are_filled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Editor button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Editor_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in the fields to be written",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_fills_in_the_fields_to_be_written()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Fill Ekleri part of Evrak Olustur",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the Editor is filled completely",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_Editor_is_filled_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Ekleri button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Ekleri_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in the input part of Ek Metni",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_fills_in_the_input_part_of_Ek_Metni()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user adds files to Dosya Ekle",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_adds_files_to_Dosya_Ekle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Ekle button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Ekle_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the added file will appear in the attachments section",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_added_file_will_appear_in_the_attachments_section()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sign the created document",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "mandatory fields are filled",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.mandatory_fields_are_filled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Imzala button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Imzala_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects s-Imza from signature types",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_selects_s_Imza_from_signature_types()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Imzala button in pop-up",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Imzala_button_in_pop_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects Evet option available in the pop-up",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_selects_Evet_option_available_in_the_pop_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the document creation is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_document_creation_is_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "View the generated document in Imzaladiklarim list",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is in main page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_is_in_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Islem Yaptiklarim",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Islem_Yaptiklarim()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Imzaladiklarim",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Imzaladiklarim()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Icerik Goster on the first document",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Icerik_Goster_on_the_first_document()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Ekleri button in the document on Imzaladiklarim",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Ekleri_button_in_the_document_on_Imzaladiklarim()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Dosya Adi should be the same as in the generated document",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_dosya_Adi_should_be_the_same_as_in_the_generated_document()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "View the generated document in Teslim Alinmayi Bekleyenler list",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is in main page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_is_in_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Birim Evraklari",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Birim_Evraklari()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Teslim Alinmayi Bekleyenler",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Teslim_Alinmayi_Bekleyenler()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects the departmant of the generated document",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_selects_the_departmant_of_the_generated_document()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Icerik Goster on the first document",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Icerik_Goster_on_the_first_document()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Ekleri button in the document on Teslim Alinmayi Bekleyenler",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_user_clicks_Ekleri_button_in_the_document_on_Teslim_Alinmayi_Bekleyenler()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Dosya Adi should be the same as in the generated document",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CreateSteps.the_dosya_Adi_should_be_the_same_as_in_the_generated_document()"
});
formatter.result({
  "status": "passed"
});
});