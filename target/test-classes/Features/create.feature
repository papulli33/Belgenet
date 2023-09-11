Feature: Create document

Create single signatory document

Scenario: Open Evrak Olustur page
	Given user is logged  in
	When user clicks on Evrak Islemleri button
	And user clicks on Evrak Olustur button
	Then Evrak Olustur window should be open
	

Scenario: Fill Bilgileri part of Evrak Olustur
	Given Evrak Olustur page is open
	When user clicks Bilgileri button
	Then user fills in the input part of Kaldirilacak Klasorler
	And user fills in the input part of Geregi
	And user fills in the input part of Onay Akisi
	

Scenario: Fill Editor part of Evrak Olustur
	Given fills out the Bilgileri completely
	When user clicks Editor button
	Then user fills in the fields to be written

	
Scenario: Fill Ekleri part of Evrak Olustur
	Given fills out the Editor completely
	When user clicks Ekleri button
	And user fills in the input part of Ek Metni
	And user adds files to Dosya Ekle 
	And user clicks Ekle button
	Then the added file will appear in the attachments section
	
	
Scenario: Sign the created document
	Given mandatory fields are fill
	When user clicks Imzala button
	And user selects s-Imza
	And user clikcs Imzala button in pop-up
	And user selects Evet option available in the pop-up
	Then document creation is successful
	And home page opens
	