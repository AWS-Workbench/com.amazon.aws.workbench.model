/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.SecretStringGeneratorBuilder_secretsmanager;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secret String Generator Builder secretsmanager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getExcludeCharacters_java_lang_String_ <em>Exclude Characters java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getExcludeLowercase_java_lang_Boolean_ <em>Exclude Lowercase java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getExcludeNumbers_java_lang_Boolean_ <em>Exclude Numbers java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getExcludePunctuation_java_lang_Boolean_ <em>Exclude Punctuation java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getExcludeUppercase_java_lang_Boolean_ <em>Exclude Uppercase java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getGenerateStringKey_java_lang_String_ <em>Generate String Key java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getIncludeSpace_java_lang_Boolean_ <em>Include Space java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getPasswordLength_java_lang_Number_ <em>Password Length java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getRequireEachIncludedType_java_lang_Boolean_ <em>Require Each Included Type java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getSecretStringTemplate_java_lang_String_ <em>Secret String Template java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecretStringGeneratorBuilder_secretsmanagerImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecretStringGeneratorBuilder_secretsmanagerImpl extends ServiceResourcesImpl
		implements SecretStringGeneratorBuilder_secretsmanager {
	/**
	 * The default value of the '{@link #getExcludeCharacters_java_lang_String_() <em>Exclude Characters java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeCharacters_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_CHARACTERS_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeCharacters_java_lang_String_() <em>Exclude Characters java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeCharacters_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String excludeCharacters_java_lang_String_ = EXCLUDE_CHARACTERS_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeLowercase_java_lang_Boolean_() <em>Exclude Lowercase java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeLowercase_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUDE_LOWERCASE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeLowercase_java_lang_Boolean_() <em>Exclude Lowercase java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeLowercase_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean excludeLowercase_java_lang_Boolean_ = EXCLUDE_LOWERCASE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeNumbers_java_lang_Boolean_() <em>Exclude Numbers java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeNumbers_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUDE_NUMBERS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeNumbers_java_lang_Boolean_() <em>Exclude Numbers java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeNumbers_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean excludeNumbers_java_lang_Boolean_ = EXCLUDE_NUMBERS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludePunctuation_java_lang_Boolean_() <em>Exclude Punctuation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludePunctuation_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUDE_PUNCTUATION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludePunctuation_java_lang_Boolean_() <em>Exclude Punctuation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludePunctuation_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean excludePunctuation_java_lang_Boolean_ = EXCLUDE_PUNCTUATION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeUppercase_java_lang_Boolean_() <em>Exclude Uppercase java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeUppercase_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUDE_UPPERCASE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeUppercase_java_lang_Boolean_() <em>Exclude Uppercase java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeUppercase_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean excludeUppercase_java_lang_Boolean_ = EXCLUDE_UPPERCASE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerateStringKey_java_lang_String_() <em>Generate String Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerateStringKey_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATE_STRING_KEY_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerateStringKey_java_lang_String_() <em>Generate String Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerateStringKey_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String generateStringKey_java_lang_String_ = GENERATE_STRING_KEY_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeSpace_java_lang_Boolean_() <em>Include Space java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeSpace_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_SPACE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeSpace_java_lang_Boolean_() <em>Include Space java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeSpace_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeSpace_java_lang_Boolean_ = INCLUDE_SPACE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordLength_java_lang_Number_() <em>Password Length java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordLength_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int PASSWORD_LENGTH_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPasswordLength_java_lang_Number_() <em>Password Length java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordLength_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int passwordLength_java_lang_Number_ = PASSWORD_LENGTH_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getRequireEachIncludedType_java_lang_Boolean_() <em>Require Each Included Type java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireEachIncludedType_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRE_EACH_INCLUDED_TYPE_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequireEachIncludedType_java_lang_Boolean_() <em>Require Each Included Type java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireEachIncludedType_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean requireEachIncludedType_java_lang_Boolean_ = REQUIRE_EACH_INCLUDED_TYPE_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getSecretStringTemplate_java_lang_String_() <em>Secret String Template java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretStringTemplate_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_STRING_TEMPLATE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecretStringTemplate_java_lang_String_() <em>Secret String Template java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretStringTemplate_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String secretStringTemplate_java_lang_String_ = SECRET_STRING_TEMPLATE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.secretsmanager.SecretStringGenerator";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretStringGeneratorBuilder_secretsmanagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExcludeCharacters_java_lang_String_() {
		return excludeCharacters_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludeCharacters_java_lang_String_(String newExcludeCharacters_java_lang_String_) {
		String oldExcludeCharacters_java_lang_String_ = excludeCharacters_java_lang_String_;
		excludeCharacters_java_lang_String_ = newExcludeCharacters_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_CHARACTERS_JAVA_LANG_STRING_,
					oldExcludeCharacters_java_lang_String_, excludeCharacters_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExcludeLowercase_java_lang_Boolean_() {
		return excludeLowercase_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludeLowercase_java_lang_Boolean_(Boolean newExcludeLowercase_java_lang_Boolean_) {
		Boolean oldExcludeLowercase_java_lang_Boolean_ = excludeLowercase_java_lang_Boolean_;
		excludeLowercase_java_lang_Boolean_ = newExcludeLowercase_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_LOWERCASE_JAVA_LANG_BOOLEAN_,
					oldExcludeLowercase_java_lang_Boolean_, excludeLowercase_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExcludeNumbers_java_lang_Boolean_() {
		return excludeNumbers_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludeNumbers_java_lang_Boolean_(Boolean newExcludeNumbers_java_lang_Boolean_) {
		Boolean oldExcludeNumbers_java_lang_Boolean_ = excludeNumbers_java_lang_Boolean_;
		excludeNumbers_java_lang_Boolean_ = newExcludeNumbers_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_NUMBERS_JAVA_LANG_BOOLEAN_,
					oldExcludeNumbers_java_lang_Boolean_, excludeNumbers_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExcludePunctuation_java_lang_Boolean_() {
		return excludePunctuation_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludePunctuation_java_lang_Boolean_(Boolean newExcludePunctuation_java_lang_Boolean_) {
		Boolean oldExcludePunctuation_java_lang_Boolean_ = excludePunctuation_java_lang_Boolean_;
		excludePunctuation_java_lang_Boolean_ = newExcludePunctuation_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_PUNCTUATION_JAVA_LANG_BOOLEAN_,
					oldExcludePunctuation_java_lang_Boolean_, excludePunctuation_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExcludeUppercase_java_lang_Boolean_() {
		return excludeUppercase_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludeUppercase_java_lang_Boolean_(Boolean newExcludeUppercase_java_lang_Boolean_) {
		Boolean oldExcludeUppercase_java_lang_Boolean_ = excludeUppercase_java_lang_Boolean_;
		excludeUppercase_java_lang_Boolean_ = newExcludeUppercase_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_UPPERCASE_JAVA_LANG_BOOLEAN_,
					oldExcludeUppercase_java_lang_Boolean_, excludeUppercase_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGenerateStringKey_java_lang_String_() {
		return generateStringKey_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateStringKey_java_lang_String_(String newGenerateStringKey_java_lang_String_) {
		String oldGenerateStringKey_java_lang_String_ = generateStringKey_java_lang_String_;
		generateStringKey_java_lang_String_ = newGenerateStringKey_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__GENERATE_STRING_KEY_JAVA_LANG_STRING_,
					oldGenerateStringKey_java_lang_String_, generateStringKey_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeSpace_java_lang_Boolean_() {
		return includeSpace_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeSpace_java_lang_Boolean_(Boolean newIncludeSpace_java_lang_Boolean_) {
		Boolean oldIncludeSpace_java_lang_Boolean_ = includeSpace_java_lang_Boolean_;
		includeSpace_java_lang_Boolean_ = newIncludeSpace_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__INCLUDE_SPACE_JAVA_LANG_BOOLEAN_,
					oldIncludeSpace_java_lang_Boolean_, includeSpace_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPasswordLength_java_lang_Number_() {
		return passwordLength_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasswordLength_java_lang_Number_(int newPasswordLength_java_lang_Number_) {
		int oldPasswordLength_java_lang_Number_ = passwordLength_java_lang_Number_;
		passwordLength_java_lang_Number_ = newPasswordLength_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__PASSWORD_LENGTH_JAVA_LANG_NUMBER_,
					oldPasswordLength_java_lang_Number_, passwordLength_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRequireEachIncludedType_java_lang_Boolean_() {
		return requireEachIncludedType_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireEachIncludedType_java_lang_Boolean_(Boolean newRequireEachIncludedType_java_lang_Boolean_) {
		Boolean oldRequireEachIncludedType_java_lang_Boolean_ = requireEachIncludedType_java_lang_Boolean_;
		requireEachIncludedType_java_lang_Boolean_ = newRequireEachIncludedType_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__REQUIRE_EACH_INCLUDED_TYPE_JAVA_LANG_BOOLEAN_,
					oldRequireEachIncludedType_java_lang_Boolean_, requireEachIncludedType_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecretStringTemplate_java_lang_String_() {
		return secretStringTemplate_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecretStringTemplate_java_lang_String_(String newSecretStringTemplate_java_lang_String_) {
		String oldSecretStringTemplate_java_lang_String_ = secretStringTemplate_java_lang_String_;
		secretStringTemplate_java_lang_String_ = newSecretStringTemplate_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__SECRET_STRING_TEMPLATE_JAVA_LANG_STRING_,
					oldSecretStringTemplate_java_lang_String_, secretStringTemplate_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__IDENTIFIER, oldIdentifier,
					identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_CHARACTERS_JAVA_LANG_STRING_:
			return getExcludeCharacters_java_lang_String_();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_LOWERCASE_JAVA_LANG_BOOLEAN_:
			return getExcludeLowercase_java_lang_Boolean_();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_NUMBERS_JAVA_LANG_BOOLEAN_:
			return getExcludeNumbers_java_lang_Boolean_();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_PUNCTUATION_JAVA_LANG_BOOLEAN_:
			return getExcludePunctuation_java_lang_Boolean_();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_UPPERCASE_JAVA_LANG_BOOLEAN_:
			return getExcludeUppercase_java_lang_Boolean_();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__GENERATE_STRING_KEY_JAVA_LANG_STRING_:
			return getGenerateStringKey_java_lang_String_();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__INCLUDE_SPACE_JAVA_LANG_BOOLEAN_:
			return getIncludeSpace_java_lang_Boolean_();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__PASSWORD_LENGTH_JAVA_LANG_NUMBER_:
			return getPasswordLength_java_lang_Number_();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__REQUIRE_EACH_INCLUDED_TYPE_JAVA_LANG_BOOLEAN_:
			return getRequireEachIncludedType_java_lang_Boolean_();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__SECRET_STRING_TEMPLATE_JAVA_LANG_STRING_:
			return getSecretStringTemplate_java_lang_String_();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_CHARACTERS_JAVA_LANG_STRING_:
			setExcludeCharacters_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_LOWERCASE_JAVA_LANG_BOOLEAN_:
			setExcludeLowercase_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_NUMBERS_JAVA_LANG_BOOLEAN_:
			setExcludeNumbers_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_PUNCTUATION_JAVA_LANG_BOOLEAN_:
			setExcludePunctuation_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_UPPERCASE_JAVA_LANG_BOOLEAN_:
			setExcludeUppercase_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__GENERATE_STRING_KEY_JAVA_LANG_STRING_:
			setGenerateStringKey_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__INCLUDE_SPACE_JAVA_LANG_BOOLEAN_:
			setIncludeSpace_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__PASSWORD_LENGTH_JAVA_LANG_NUMBER_:
			setPasswordLength_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__REQUIRE_EACH_INCLUDED_TYPE_JAVA_LANG_BOOLEAN_:
			setRequireEachIncludedType_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__SECRET_STRING_TEMPLATE_JAVA_LANG_STRING_:
			setSecretStringTemplate_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_CHARACTERS_JAVA_LANG_STRING_:
			setExcludeCharacters_java_lang_String_(EXCLUDE_CHARACTERS_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_LOWERCASE_JAVA_LANG_BOOLEAN_:
			setExcludeLowercase_java_lang_Boolean_(EXCLUDE_LOWERCASE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_NUMBERS_JAVA_LANG_BOOLEAN_:
			setExcludeNumbers_java_lang_Boolean_(EXCLUDE_NUMBERS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_PUNCTUATION_JAVA_LANG_BOOLEAN_:
			setExcludePunctuation_java_lang_Boolean_(EXCLUDE_PUNCTUATION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_UPPERCASE_JAVA_LANG_BOOLEAN_:
			setExcludeUppercase_java_lang_Boolean_(EXCLUDE_UPPERCASE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__GENERATE_STRING_KEY_JAVA_LANG_STRING_:
			setGenerateStringKey_java_lang_String_(GENERATE_STRING_KEY_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__INCLUDE_SPACE_JAVA_LANG_BOOLEAN_:
			setIncludeSpace_java_lang_Boolean_(INCLUDE_SPACE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__PASSWORD_LENGTH_JAVA_LANG_NUMBER_:
			setPasswordLength_java_lang_Number_(PASSWORD_LENGTH_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__REQUIRE_EACH_INCLUDED_TYPE_JAVA_LANG_BOOLEAN_:
			setRequireEachIncludedType_java_lang_Boolean_(REQUIRE_EACH_INCLUDED_TYPE_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__SECRET_STRING_TEMPLATE_JAVA_LANG_STRING_:
			setSecretStringTemplate_java_lang_String_(SECRET_STRING_TEMPLATE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_CHARACTERS_JAVA_LANG_STRING_:
			return EXCLUDE_CHARACTERS_JAVA_LANG_STRING__EDEFAULT == null ? excludeCharacters_java_lang_String_ != null
					: !EXCLUDE_CHARACTERS_JAVA_LANG_STRING__EDEFAULT.equals(excludeCharacters_java_lang_String_);
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_LOWERCASE_JAVA_LANG_BOOLEAN_:
			return EXCLUDE_LOWERCASE_JAVA_LANG_BOOLEAN__EDEFAULT == null ? excludeLowercase_java_lang_Boolean_ != null
					: !EXCLUDE_LOWERCASE_JAVA_LANG_BOOLEAN__EDEFAULT.equals(excludeLowercase_java_lang_Boolean_);
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_NUMBERS_JAVA_LANG_BOOLEAN_:
			return EXCLUDE_NUMBERS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? excludeNumbers_java_lang_Boolean_ != null
					: !EXCLUDE_NUMBERS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(excludeNumbers_java_lang_Boolean_);
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_PUNCTUATION_JAVA_LANG_BOOLEAN_:
			return EXCLUDE_PUNCTUATION_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? excludePunctuation_java_lang_Boolean_ != null
					: !EXCLUDE_PUNCTUATION_JAVA_LANG_BOOLEAN__EDEFAULT.equals(excludePunctuation_java_lang_Boolean_);
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__EXCLUDE_UPPERCASE_JAVA_LANG_BOOLEAN_:
			return EXCLUDE_UPPERCASE_JAVA_LANG_BOOLEAN__EDEFAULT == null ? excludeUppercase_java_lang_Boolean_ != null
					: !EXCLUDE_UPPERCASE_JAVA_LANG_BOOLEAN__EDEFAULT.equals(excludeUppercase_java_lang_Boolean_);
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__GENERATE_STRING_KEY_JAVA_LANG_STRING_:
			return GENERATE_STRING_KEY_JAVA_LANG_STRING__EDEFAULT == null ? generateStringKey_java_lang_String_ != null
					: !GENERATE_STRING_KEY_JAVA_LANG_STRING__EDEFAULT.equals(generateStringKey_java_lang_String_);
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__INCLUDE_SPACE_JAVA_LANG_BOOLEAN_:
			return INCLUDE_SPACE_JAVA_LANG_BOOLEAN__EDEFAULT == null ? includeSpace_java_lang_Boolean_ != null
					: !INCLUDE_SPACE_JAVA_LANG_BOOLEAN__EDEFAULT.equals(includeSpace_java_lang_Boolean_);
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__PASSWORD_LENGTH_JAVA_LANG_NUMBER_:
			return passwordLength_java_lang_Number_ != PASSWORD_LENGTH_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__REQUIRE_EACH_INCLUDED_TYPE_JAVA_LANG_BOOLEAN_:
			return REQUIRE_EACH_INCLUDED_TYPE_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? requireEachIncludedType_java_lang_Boolean_ != null
					: !REQUIRE_EACH_INCLUDED_TYPE_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(requireEachIncludedType_java_lang_Boolean_);
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__SECRET_STRING_TEMPLATE_JAVA_LANG_STRING_:
			return SECRET_STRING_TEMPLATE_JAVA_LANG_STRING__EDEFAULT == null
					? secretStringTemplate_java_lang_String_ != null
					: !SECRET_STRING_TEMPLATE_JAVA_LANG_STRING__EDEFAULT.equals(secretStringTemplate_java_lang_String_);
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.SECRET_STRING_GENERATOR_BUILDER_SECRETSMANAGER__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (excludeCharacters_java_lang_String_: ");
		result.append(excludeCharacters_java_lang_String_);
		result.append(", excludeLowercase_java_lang_Boolean_: ");
		result.append(excludeLowercase_java_lang_Boolean_);
		result.append(", excludeNumbers_java_lang_Boolean_: ");
		result.append(excludeNumbers_java_lang_Boolean_);
		result.append(", excludePunctuation_java_lang_Boolean_: ");
		result.append(excludePunctuation_java_lang_Boolean_);
		result.append(", excludeUppercase_java_lang_Boolean_: ");
		result.append(excludeUppercase_java_lang_Boolean_);
		result.append(", generateStringKey_java_lang_String_: ");
		result.append(generateStringKey_java_lang_String_);
		result.append(", includeSpace_java_lang_Boolean_: ");
		result.append(includeSpace_java_lang_Boolean_);
		result.append(", passwordLength_java_lang_Number_: ");
		result.append(passwordLength_java_lang_Number_);
		result.append(", requireEachIncludedType_java_lang_Boolean_: ");
		result.append(requireEachIncludedType_java_lang_Boolean_);
		result.append(", secretStringTemplate_java_lang_String_: ");
		result.append(secretStringTemplate_java_lang_String_);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //SecretStringGeneratorBuilder_secretsmanagerImpl
