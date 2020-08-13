/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CorsRuleBuilder_s3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cors Rule Builder s3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CorsRuleBuilder_s3Impl#getAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList <em>Allowed Methods software amazon awscdk services s3 Http Methods As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CorsRuleBuilder_s3Impl#getAllowedOrigins_java_lang_String_AsList <em>Allowed Origins java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CorsRuleBuilder_s3Impl#getAllowedHeaders_java_lang_String_AsList <em>Allowed Headers java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CorsRuleBuilder_s3Impl#getExposedHeaders_java_lang_String_AsList <em>Exposed Headers java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CorsRuleBuilder_s3Impl#getId_java_lang_String_ <em>Id java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CorsRuleBuilder_s3Impl#getMaxAge_java_lang_Number_ <em>Max Age java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CorsRuleBuilder_s3Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CorsRuleBuilder_s3Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CorsRuleBuilder_s3Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CorsRuleBuilder_s3Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorsRuleBuilder_s3Impl extends ServiceResourcesImpl implements CorsRuleBuilder_s3 {
	/**
	 * The default value of the '{@link #getAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList() <em>Allowed Methods software amazon awscdk services s3 Http Methods As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_HTTP_METHODS_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList() <em>Allowed Methods software amazon awscdk services s3 Http Methods As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList()
	 * @generated
	 * @ordered
	 */
	protected String allowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList = ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_HTTP_METHODS_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowedOrigins_java_lang_String_AsList() <em>Allowed Origins java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedOrigins_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_ORIGINS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedOrigins_java_lang_String_AsList() <em>Allowed Origins java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedOrigins_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String allowedOrigins_java_lang_String_AsList = ALLOWED_ORIGINS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowedHeaders_java_lang_String_AsList() <em>Allowed Headers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedHeaders_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedHeaders_java_lang_String_AsList() <em>Allowed Headers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedHeaders_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String allowedHeaders_java_lang_String_AsList = ALLOWED_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getExposedHeaders_java_lang_String_AsList() <em>Exposed Headers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposedHeaders_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPOSED_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExposedHeaders_java_lang_String_AsList() <em>Exposed Headers java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposedHeaders_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String exposedHeaders_java_lang_String_AsList = EXPOSED_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getId_java_lang_String_() <em>Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId_java_lang_String_() <em>Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String id_java_lang_String_ = ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAge_java_lang_Number_() <em>Max Age java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAge_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_AGE_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxAge_java_lang_Number_() <em>Max Age java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAge_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxAge_java_lang_Number_ = MAX_AGE_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.s3.CorsRule";

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
	protected CorsRuleBuilder_s3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.CORS_RULE_BUILDER_S3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList() {
		return allowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList(
			String newAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList) {
		String oldAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList = allowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList;
		allowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList = newAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_HTTP_METHODS_AS_LIST,
					oldAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList,
					allowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowedOrigins_java_lang_String_AsList() {
		return allowedOrigins_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowedOrigins_java_lang_String_AsList(String newAllowedOrigins_java_lang_String_AsList) {
		String oldAllowedOrigins_java_lang_String_AsList = allowedOrigins_java_lang_String_AsList;
		allowedOrigins_java_lang_String_AsList = newAllowedOrigins_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_ORIGINS_JAVA_LANG_STRING_AS_LIST,
					oldAllowedOrigins_java_lang_String_AsList, allowedOrigins_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowedHeaders_java_lang_String_AsList() {
		return allowedHeaders_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowedHeaders_java_lang_String_AsList(String newAllowedHeaders_java_lang_String_AsList) {
		String oldAllowedHeaders_java_lang_String_AsList = allowedHeaders_java_lang_String_AsList;
		allowedHeaders_java_lang_String_AsList = newAllowedHeaders_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_HEADERS_JAVA_LANG_STRING_AS_LIST,
					oldAllowedHeaders_java_lang_String_AsList, allowedHeaders_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExposedHeaders_java_lang_String_AsList() {
		return exposedHeaders_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExposedHeaders_java_lang_String_AsList(String newExposedHeaders_java_lang_String_AsList) {
		String oldExposedHeaders_java_lang_String_AsList = exposedHeaders_java_lang_String_AsList;
		exposedHeaders_java_lang_String_AsList = newExposedHeaders_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CORS_RULE_BUILDER_S3__EXPOSED_HEADERS_JAVA_LANG_STRING_AS_LIST,
					oldExposedHeaders_java_lang_String_AsList, exposedHeaders_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId_java_lang_String_() {
		return id_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId_java_lang_String_(String newId_java_lang_String_) {
		String oldId_java_lang_String_ = id_java_lang_String_;
		id_java_lang_String_ = newId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_, oldId_java_lang_String_,
					id_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxAge_java_lang_Number_() {
		return maxAge_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAge_java_lang_Number_(int newMaxAge_java_lang_Number_) {
		int oldMaxAge_java_lang_Number_ = maxAge_java_lang_Number_;
		maxAge_java_lang_Number_ = newMaxAge_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CORS_RULE_BUILDER_S3__MAX_AGE_JAVA_LANG_NUMBER_, oldMaxAge_java_lang_Number_,
					maxAge_java_lang_Number_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.CORS_RULE_BUILDER_S3__VAR_NAME,
					oldVarName, varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.CORS_RULE_BUILDER_S3__IDENTIFIER,
					oldIdentifier, identifier));
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
					AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_HTTP_METHODS_AS_LIST:
			return getAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList();
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_ORIGINS_JAVA_LANG_STRING_AS_LIST:
			return getAllowedOrigins_java_lang_String_AsList();
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_HEADERS_JAVA_LANG_STRING_AS_LIST:
			return getAllowedHeaders_java_lang_String_AsList();
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__EXPOSED_HEADERS_JAVA_LANG_STRING_AS_LIST:
			return getExposedHeaders_java_lang_String_AsList();
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_:
			return getId_java_lang_String_();
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__MAX_AGE_JAVA_LANG_NUMBER_:
			return getMaxAge_java_lang_Number_();
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_HTTP_METHODS_AS_LIST:
			setAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_ORIGINS_JAVA_LANG_STRING_AS_LIST:
			setAllowedOrigins_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_HEADERS_JAVA_LANG_STRING_AS_LIST:
			setAllowedHeaders_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__EXPOSED_HEADERS_JAVA_LANG_STRING_AS_LIST:
			setExposedHeaders_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_:
			setId_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__MAX_AGE_JAVA_LANG_NUMBER_:
			setMaxAge_java_lang_Number_((Integer) newValue);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_HTTP_METHODS_AS_LIST:
			setAllowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList(
					ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_HTTP_METHODS_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_ORIGINS_JAVA_LANG_STRING_AS_LIST:
			setAllowedOrigins_java_lang_String_AsList(ALLOWED_ORIGINS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_HEADERS_JAVA_LANG_STRING_AS_LIST:
			setAllowedHeaders_java_lang_String_AsList(ALLOWED_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__EXPOSED_HEADERS_JAVA_LANG_STRING_AS_LIST:
			setExposedHeaders_java_lang_String_AsList(EXPOSED_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_:
			setId_java_lang_String_(ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__MAX_AGE_JAVA_LANG_NUMBER_:
			setMaxAge_java_lang_Number_(MAX_AGE_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_HTTP_METHODS_AS_LIST:
			return ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_HTTP_METHODS_AS_LIST_EDEFAULT == null
					? allowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList != null
					: !ALLOWED_METHODS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_HTTP_METHODS_AS_LIST_EDEFAULT
							.equals(allowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList);
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_ORIGINS_JAVA_LANG_STRING_AS_LIST:
			return ALLOWED_ORIGINS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? allowedOrigins_java_lang_String_AsList != null
					: !ALLOWED_ORIGINS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(allowedOrigins_java_lang_String_AsList);
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ALLOWED_HEADERS_JAVA_LANG_STRING_AS_LIST:
			return ALLOWED_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? allowedHeaders_java_lang_String_AsList != null
					: !ALLOWED_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(allowedHeaders_java_lang_String_AsList);
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__EXPOSED_HEADERS_JAVA_LANG_STRING_AS_LIST:
			return EXPOSED_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null
					? exposedHeaders_java_lang_String_AsList != null
					: !EXPOSED_HEADERS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(exposedHeaders_java_lang_String_AsList);
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_:
			return ID_JAVA_LANG_STRING__EDEFAULT == null ? id_java_lang_String_ != null
					: !ID_JAVA_LANG_STRING__EDEFAULT.equals(id_java_lang_String_);
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__MAX_AGE_JAVA_LANG_NUMBER_:
			return maxAge_java_lang_Number_ != MAX_AGE_JAVA_LANG_NUMBER__EDEFAULT;
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.CORS_RULE_BUILDER_S3__ADDITIONAL_CODE:
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
		result.append(" (allowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList: ");
		result.append(allowedMethods_software_amazon_awscdk_services_s3_HttpMethods_AsList);
		result.append(", allowedOrigins_java_lang_String_AsList: ");
		result.append(allowedOrigins_java_lang_String_AsList);
		result.append(", allowedHeaders_java_lang_String_AsList: ");
		result.append(allowedHeaders_java_lang_String_AsList);
		result.append(", exposedHeaders_java_lang_String_AsList: ");
		result.append(exposedHeaders_java_lang_String_AsList);
		result.append(", id_java_lang_String_: ");
		result.append(id_java_lang_String_);
		result.append(", maxAge_java_lang_Number_: ");
		result.append(maxAge_java_lang_Number_);
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

} //CorsRuleBuilder_s3Impl
