/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LambdaToDynamoDBBuilder_lambdadynamodb;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lambda To Dynamo DB Builder lambdadynamodb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToDynamoDBBuilder_lambdadynamodbImpl#getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference <em>Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToDynamoDBBuilder_lambdadynamodbImpl#getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToDynamoDBBuilder_lambdadynamodbImpl#getExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference <em>Existing Table Obj With Table software amazon awscdk services dynamodb Table As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToDynamoDBBuilder_lambdadynamodbImpl#getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToDynamoDBBuilder_lambdadynamodbImpl#getTablePermissions_java_lang_String_ <em>Table Permissions java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToDynamoDBBuilder_lambdadynamodbImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToDynamoDBBuilder_lambdadynamodbImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToDynamoDBBuilder_lambdadynamodbImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaToDynamoDBBuilder_lambdadynamodbImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LambdaToDynamoDBBuilder_lambdadynamodbImpl extends ServiceResourcesImpl
		implements LambdaToDynamoDBBuilder_lambdadynamodb {
	/**
	 * The default value of the '{@link #getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference() <em>Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference() <em>Dynamo Table Props With Table Props software amazon awscdk services dynamodb Table Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference = DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() <em>Existing Lambda Obj With Function software amazon awscdk services lambda Function As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference = EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference() <em>Existing Table Obj With Table software amazon awscdk services dynamodb Table As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference() <em>Existing Table Obj With Table software amazon awscdk services dynamodb Table As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference = EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() <em>Lambda Function Props With Function Props software amazon awscdk services lambda Function Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference = LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTablePermissions_java_lang_String_() <em>Table Permissions java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablePermissions_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_PERMISSIONS_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTablePermissions_java_lang_String_() <em>Table Permissions java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablePermissions_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String tablePermissions_java_lang_String_ = TABLE_PERMISSIONS_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awsconstructs.services.lambdadynamodb.LambdaToDynamoDB";

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
	protected LambdaToDynamoDBBuilder_lambdadynamodbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference() {
		return dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference(
			String newDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference) {
		String oldDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference = dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference;
		dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference = newDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE,
					oldDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference,
					dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference() {
		return existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
			String newExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference) {
		String oldExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference = existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference;
		existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference = newExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE,
					oldExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference,
					existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference() {
		return existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference(
			String newExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference) {
		String oldExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference = existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference;
		existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference = newExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE,
					oldExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference,
					existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference() {
		return lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(
			String newLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference) {
		String oldLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference = lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference;
		lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference = newLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE,
					oldLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference,
					lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTablePermissions_java_lang_String_() {
		return tablePermissions_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTablePermissions_java_lang_String_(String newTablePermissions_java_lang_String_) {
		String oldTablePermissions_java_lang_String_ = tablePermissions_java_lang_String_;
		tablePermissions_java_lang_String_ = newTablePermissions_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__TABLE_PERMISSIONS_JAVA_LANG_STRING_,
					oldTablePermissions_java_lang_String_, tablePermissions_java_lang_String_));
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
					AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__IDENTIFIER, oldIdentifier,
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
					AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE:
			return getDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference();
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			return getExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference();
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE:
			return getExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference();
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
			return getLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference();
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__TABLE_PERMISSIONS_JAVA_LANG_STRING_:
			return getTablePermissions_java_lang_String_();
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE:
			setDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE:
			setExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
			setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__TABLE_PERMISSIONS_JAVA_LANG_STRING_:
			setTablePermissions_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE:
			setDynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference(
					DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			setExistingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference(
					EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE:
			setExistingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference(
					EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
			setLambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference(
					LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__TABLE_PERMISSIONS_JAVA_LANG_STRING_:
			setTablePermissions_java_lang_String_(TABLE_PERMISSIONS_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE:
			return DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE_EDEFAULT == null
					? dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference != null
					: !DYNAMO_TABLE_PROPS_WITH_TABLE_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_PROPS_AS_REFERENCE_EDEFAULT
							.equals(dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference);
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE:
			return EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT == null
					? existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference != null
					: !EXISTING_LAMBDA_OBJ_WITH_FUNCTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_AS_REFERENCE_EDEFAULT
							.equals(existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference);
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE:
			return EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE_EDEFAULT == null
					? existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference != null
					: !EXISTING_TABLE_OBJ_WITH_TABLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_DYNAMODB_TABLE_AS_REFERENCE_EDEFAULT
							.equals(existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference);
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE:
			return LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT == null
					? lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference != null
					: !LAMBDA_FUNCTION_PROPS_WITH_FUNCTION_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_FUNCTION_PROPS_AS_REFERENCE_EDEFAULT
							.equals(lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference);
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__TABLE_PERMISSIONS_JAVA_LANG_STRING_:
			return TABLE_PERMISSIONS_JAVA_LANG_STRING__EDEFAULT == null ? tablePermissions_java_lang_String_ != null
					: !TABLE_PERMISSIONS_JAVA_LANG_STRING__EDEFAULT.equals(tablePermissions_java_lang_String_);
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.LAMBDA_TO_DYNAMO_DB_BUILDER_LAMBDADYNAMODB__ADDITIONAL_CODE:
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
		result.append(
				" (dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference: ");
		result.append(dynamoTablePropsWithTableProps_software_amazon_awscdk_services_dynamodb_TableProps_AsReference);
		result.append(", existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference: ");
		result.append(existingLambdaObjWithFunction_software_amazon_awscdk_services_lambda_Function_AsReference);
		result.append(", existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference: ");
		result.append(existingTableObjWithTable_software_amazon_awscdk_services_dynamodb_Table_AsReference);
		result.append(
				", lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference: ");
		result.append(
				lambdaFunctionPropsWithFunctionProps_software_amazon_awscdk_services_lambda_FunctionProps_AsReference);
		result.append(", tablePermissions_java_lang_String_: ");
		result.append(tablePermissions_java_lang_String_);
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

} //LambdaToDynamoDBBuilder_lambdadynamodbImpl
