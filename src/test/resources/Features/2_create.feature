Feature: Create document

Create single signatory document

Scenario: Open Evrak Olustur page
    Given the user is logged  in
    When the user clicks on Evrak Islemleri button
    And the user clicks on Evrak Olustur button
    Then the Evrak Olustur window should open


Scenario: Fill the Bilgileri part of Evrak Olustur
    Given the Evrak Olustur page is open
    When the user clicks Bilgileri button
    Then the user fills in the input part of Kaldirilacak Klasorler
    And the user fills in the input part of Geregi
    And the user fills in the input part of Onay Akisi


Scenario: Fill Editor part of Evrak Olustur
    Given mandatory sections in the Bilgileri part are filled
    When the user clicks Editor button
    Then the user fills in the fields to be written


Scenario: Fill Ekleri part of Evrak Olustur
    Given the Editor is filled completely
    When the user clicks Ekleri button
    And the user fills in the input part of Ek Metni
    And the user adds files to Dosya Ekle 
    And the user clicks Ekle button
    Then the added file will appear in the attachments section


Scenario: Sign the created document
    Given mandatory fields are filled
    When the user clicks Imzala button
    And the user selects s-Imza from signature types
    And the user clicks Imzala button in pop-up
    And the user selects Evet option available in the pop-up
    Then the document creation is successful

Scenario: View the generated document in Imzaladiklarim list
	Given the user is in main page
	When the user clicks Islem Yaptiklarim
	And the user clicks Imzaladiklarim
	And the user clicks Icerik Goster on the first document
	And the user clicks Ekleri button in the document on Imzaladiklarim
	Then the Dosya Adi should be the same as in the generated document
	
Scenario: View the generated document in Teslim Alinmayi Bekleyenler list
	Given the user is in main page
	When the user clicks Birim Evraklari
	And the user clicks Teslim Alinmayi Bekleyenler
	And the user selects the departmant of the generated document
	And the user clicks Icerik Goster on the first document
	And the user clicks Ekleri button in the document on Teslim Alinmayi Bekleyenler
	Then the Dosya Adi should be the same as in the generated document
	