/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.EnvironmentBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.StackBuilder_core;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getAutoSynth_java_lang_Boolean_ <em>Auto Synth java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getContext_java_lang_String__java_lang_String_AsMap <em>Context java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getOutdir_java_lang_String_ <em>Outdir java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getRuntimeInfo_java_lang_Boolean_ <em>Runtime Info java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getStackTraces_java_lang_Boolean_ <em>Stack Traces java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getTreeMetadata_java_lang_Boolean_ <em>Tree Metadata java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getEnvironmentbuilder_core <em>Environmentbuilder core</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getDefaultstacksynthesizerbuilder_core <em>Defaultstacksynthesizerbuilder core</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getStackbuilder_core <em>Stackbuilder core</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getPackageName <em>Package Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppBuilder_coreImpl extends MinimalEObjectImpl.Container implements AppBuilder_core {
	/**
	 * The default value of the '{@link #getAutoSynth_java_lang_Boolean_() <em>Auto Synth java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSynth_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_SYNTH_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoSynth_java_lang_Boolean_() <em>Auto Synth java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSynth_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoSynth_java_lang_Boolean_ = AUTO_SYNTH_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getContext_java_lang_String__java_lang_String_AsMap() <em>Context java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext_java_lang_String__java_lang_String_AsMap() <em>Context java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String context_java_lang_String__java_lang_String_AsMap = CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutdir_java_lang_String_() <em>Outdir java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdir_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTDIR_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutdir_java_lang_String_() <em>Outdir java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdir_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String outdir_java_lang_String_ = OUTDIR_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntimeInfo_java_lang_Boolean_() <em>Runtime Info java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInfo_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RUNTIME_INFO_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntimeInfo_java_lang_Boolean_() <em>Runtime Info java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInfo_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean runtimeInfo_java_lang_Boolean_ = RUNTIME_INFO_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getStackTraces_java_lang_Boolean_() <em>Stack Traces java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackTraces_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STACK_TRACES_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStackTraces_java_lang_Boolean_() <em>Stack Traces java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackTraces_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean stackTraces_java_lang_Boolean_ = STACK_TRACES_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getTreeMetadata_java_lang_Boolean_() <em>Tree Metadata java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeMetadata_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TREE_METADATA_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreeMetadata_java_lang_Boolean_() <em>Tree Metadata java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeMetadata_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean treeMetadata_java_lang_Boolean_ = TREE_METADATA_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.App";

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
	 * The cached value of the '{@link #getEnvironmentbuilder_core() <em>Environmentbuilder core</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentbuilder_core()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvironmentBuilder_core> environmentbuilder_core;

	/**
	 * The cached value of the '{@link #getDefaultstacksynthesizerbuilder_core() <em>Defaultstacksynthesizerbuilder core</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultstacksynthesizerbuilder_core()
	 * @generated
	 * @ordered
	 */
	protected EList<DefaultStackSynthesizerBuilder_core> defaultstacksynthesizerbuilder_core;

	/**
	 * The cached value of the '{@link #getStackbuilder_core() <em>Stackbuilder core</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackbuilder_core()
	 * @generated
	 * @ordered
	 */
	protected EList<StackBuilder_core> stackbuilder_core;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.APP_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoSynth_java_lang_Boolean_() {
		return autoSynth_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoSynth_java_lang_Boolean_(Boolean newAutoSynth_java_lang_Boolean_) {
		Boolean oldAutoSynth_java_lang_Boolean_ = autoSynth_java_lang_Boolean_;
		autoSynth_java_lang_Boolean_ = newAutoSynth_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APP_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_,
					oldAutoSynth_java_lang_Boolean_, autoSynth_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContext_java_lang_String__java_lang_String_AsMap() {
		return context_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext_java_lang_String__java_lang_String_AsMap(
			String newContext_java_lang_String__java_lang_String_AsMap) {
		String oldContext_java_lang_String__java_lang_String_AsMap = context_java_lang_String__java_lang_String_AsMap;
		context_java_lang_String__java_lang_String_AsMap = newContext_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APP_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldContext_java_lang_String__java_lang_String_AsMap,
					context_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutdir_java_lang_String_() {
		return outdir_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutdir_java_lang_String_(String newOutdir_java_lang_String_) {
		String oldOutdir_java_lang_String_ = outdir_java_lang_String_;
		outdir_java_lang_String_ = newOutdir_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APP_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_, oldOutdir_java_lang_String_,
					outdir_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRuntimeInfo_java_lang_Boolean_() {
		return runtimeInfo_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeInfo_java_lang_Boolean_(Boolean newRuntimeInfo_java_lang_Boolean_) {
		Boolean oldRuntimeInfo_java_lang_Boolean_ = runtimeInfo_java_lang_Boolean_;
		runtimeInfo_java_lang_Boolean_ = newRuntimeInfo_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APP_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_,
					oldRuntimeInfo_java_lang_Boolean_, runtimeInfo_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getStackTraces_java_lang_Boolean_() {
		return stackTraces_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStackTraces_java_lang_Boolean_(Boolean newStackTraces_java_lang_Boolean_) {
		Boolean oldStackTraces_java_lang_Boolean_ = stackTraces_java_lang_Boolean_;
		stackTraces_java_lang_Boolean_ = newStackTraces_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APP_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_,
					oldStackTraces_java_lang_Boolean_, stackTraces_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTreeMetadata_java_lang_Boolean_() {
		return treeMetadata_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreeMetadata_java_lang_Boolean_(Boolean newTreeMetadata_java_lang_Boolean_) {
		Boolean oldTreeMetadata_java_lang_Boolean_ = treeMetadata_java_lang_Boolean_;
		treeMetadata_java_lang_Boolean_ = newTreeMetadata_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.APP_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_,
					oldTreeMetadata_java_lang_Boolean_, treeMetadata_java_lang_Boolean_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.APP_BUILDER_CORE__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.APP_BUILDER_CORE__IDENTIFIER,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.APP_BUILDER_CORE__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnvironmentBuilder_core> getEnvironmentbuilder_core() {
		if (environmentbuilder_core == null) {
			environmentbuilder_core = new EObjectContainmentEList<EnvironmentBuilder_core>(
					EnvironmentBuilder_core.class, this, AwsworkbenchPackage.APP_BUILDER_CORE__ENVIRONMENTBUILDER_CORE);
		}
		return environmentbuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefaultStackSynthesizerBuilder_core> getDefaultstacksynthesizerbuilder_core() {
		if (defaultstacksynthesizerbuilder_core == null) {
			defaultstacksynthesizerbuilder_core = new EObjectContainmentEList<DefaultStackSynthesizerBuilder_core>(
					DefaultStackSynthesizerBuilder_core.class, this,
					AwsworkbenchPackage.APP_BUILDER_CORE__DEFAULTSTACKSYNTHESIZERBUILDER_CORE);
		}
		return defaultstacksynthesizerbuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StackBuilder_core> getStackbuilder_core() {
		if (stackbuilder_core == null) {
			stackbuilder_core = new EObjectContainmentEList<StackBuilder_core>(StackBuilder_core.class, this,
					AwsworkbenchPackage.APP_BUILDER_CORE__STACKBUILDER_CORE);
		}
		return stackbuilder_core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.APP_BUILDER_CORE__PROJECT_NAME,
					oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.APP_BUILDER_CORE__PACKAGE_NAME,
					oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AwsworkbenchPackage.APP_BUILDER_CORE__ENVIRONMENTBUILDER_CORE:
			return ((InternalEList<?>) getEnvironmentbuilder_core()).basicRemove(otherEnd, msgs);
		case AwsworkbenchPackage.APP_BUILDER_CORE__DEFAULTSTACKSYNTHESIZERBUILDER_CORE:
			return ((InternalEList<?>) getDefaultstacksynthesizerbuilder_core()).basicRemove(otherEnd, msgs);
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACKBUILDER_CORE:
			return ((InternalEList<?>) getStackbuilder_core()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.APP_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_:
			return getAutoSynth_java_lang_Boolean_();
		case AwsworkbenchPackage.APP_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getContext_java_lang_String__java_lang_String_AsMap();
		case AwsworkbenchPackage.APP_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_:
			return getOutdir_java_lang_String_();
		case AwsworkbenchPackage.APP_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_:
			return getRuntimeInfo_java_lang_Boolean_();
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_:
			return getStackTraces_java_lang_Boolean_();
		case AwsworkbenchPackage.APP_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_:
			return getTreeMetadata_java_lang_Boolean_();
		case AwsworkbenchPackage.APP_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.APP_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.APP_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.APP_BUILDER_CORE__ADDITIONAL_CODE:
			return getAdditionalCode();
		case AwsworkbenchPackage.APP_BUILDER_CORE__ENVIRONMENTBUILDER_CORE:
			return getEnvironmentbuilder_core();
		case AwsworkbenchPackage.APP_BUILDER_CORE__DEFAULTSTACKSYNTHESIZERBUILDER_CORE:
			return getDefaultstacksynthesizerbuilder_core();
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACKBUILDER_CORE:
			return getStackbuilder_core();
		case AwsworkbenchPackage.APP_BUILDER_CORE__PROJECT_NAME:
			return getProjectName();
		case AwsworkbenchPackage.APP_BUILDER_CORE__PACKAGE_NAME:
			return getPackageName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.APP_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_:
			setAutoSynth_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setContext_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_:
			setOutdir_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_:
			setRuntimeInfo_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_:
			setStackTraces_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_:
			setTreeMetadata_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__ENVIRONMENTBUILDER_CORE:
			getEnvironmentbuilder_core().clear();
			getEnvironmentbuilder_core().addAll((Collection<? extends EnvironmentBuilder_core>) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__DEFAULTSTACKSYNTHESIZERBUILDER_CORE:
			getDefaultstacksynthesizerbuilder_core().clear();
			getDefaultstacksynthesizerbuilder_core()
					.addAll((Collection<? extends DefaultStackSynthesizerBuilder_core>) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACKBUILDER_CORE:
			getStackbuilder_core().clear();
			getStackbuilder_core().addAll((Collection<? extends StackBuilder_core>) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__PROJECT_NAME:
			setProjectName((String) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__PACKAGE_NAME:
			setPackageName((String) newValue);
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
		case AwsworkbenchPackage.APP_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_:
			setAutoSynth_java_lang_Boolean_(AUTO_SYNTH_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setContext_java_lang_String__java_lang_String_AsMap(
					CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_:
			setOutdir_java_lang_String_(OUTDIR_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_:
			setRuntimeInfo_java_lang_Boolean_(RUNTIME_INFO_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_:
			setStackTraces_java_lang_Boolean_(STACK_TRACES_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_:
			setTreeMetadata_java_lang_Boolean_(TREE_METADATA_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__ENVIRONMENTBUILDER_CORE:
			getEnvironmentbuilder_core().clear();
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__DEFAULTSTACKSYNTHESIZERBUILDER_CORE:
			getDefaultstacksynthesizerbuilder_core().clear();
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACKBUILDER_CORE:
			getStackbuilder_core().clear();
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__PROJECT_NAME:
			setProjectName(PROJECT_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__PACKAGE_NAME:
			setPackageName(PACKAGE_NAME_EDEFAULT);
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
		case AwsworkbenchPackage.APP_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_:
			return AUTO_SYNTH_JAVA_LANG_BOOLEAN__EDEFAULT == null ? autoSynth_java_lang_Boolean_ != null
					: !AUTO_SYNTH_JAVA_LANG_BOOLEAN__EDEFAULT.equals(autoSynth_java_lang_Boolean_);
		case AwsworkbenchPackage.APP_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? context_java_lang_String__java_lang_String_AsMap != null
					: !CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(context_java_lang_String__java_lang_String_AsMap);
		case AwsworkbenchPackage.APP_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_:
			return OUTDIR_JAVA_LANG_STRING__EDEFAULT == null ? outdir_java_lang_String_ != null
					: !OUTDIR_JAVA_LANG_STRING__EDEFAULT.equals(outdir_java_lang_String_);
		case AwsworkbenchPackage.APP_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_:
			return RUNTIME_INFO_JAVA_LANG_BOOLEAN__EDEFAULT == null ? runtimeInfo_java_lang_Boolean_ != null
					: !RUNTIME_INFO_JAVA_LANG_BOOLEAN__EDEFAULT.equals(runtimeInfo_java_lang_Boolean_);
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_:
			return STACK_TRACES_JAVA_LANG_BOOLEAN__EDEFAULT == null ? stackTraces_java_lang_Boolean_ != null
					: !STACK_TRACES_JAVA_LANG_BOOLEAN__EDEFAULT.equals(stackTraces_java_lang_Boolean_);
		case AwsworkbenchPackage.APP_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_:
			return TREE_METADATA_JAVA_LANG_BOOLEAN__EDEFAULT == null ? treeMetadata_java_lang_Boolean_ != null
					: !TREE_METADATA_JAVA_LANG_BOOLEAN__EDEFAULT.equals(treeMetadata_java_lang_Boolean_);
		case AwsworkbenchPackage.APP_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.APP_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.APP_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.APP_BUILDER_CORE__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		case AwsworkbenchPackage.APP_BUILDER_CORE__ENVIRONMENTBUILDER_CORE:
			return environmentbuilder_core != null && !environmentbuilder_core.isEmpty();
		case AwsworkbenchPackage.APP_BUILDER_CORE__DEFAULTSTACKSYNTHESIZERBUILDER_CORE:
			return defaultstacksynthesizerbuilder_core != null && !defaultstacksynthesizerbuilder_core.isEmpty();
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACKBUILDER_CORE:
			return stackbuilder_core != null && !stackbuilder_core.isEmpty();
		case AwsworkbenchPackage.APP_BUILDER_CORE__PROJECT_NAME:
			return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
		case AwsworkbenchPackage.APP_BUILDER_CORE__PACKAGE_NAME:
			return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
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
		result.append(" (autoSynth_java_lang_Boolean_: ");
		result.append(autoSynth_java_lang_Boolean_);
		result.append(", context_java_lang_String__java_lang_String_AsMap: ");
		result.append(context_java_lang_String__java_lang_String_AsMap);
		result.append(", outdir_java_lang_String_: ");
		result.append(outdir_java_lang_String_);
		result.append(", runtimeInfo_java_lang_Boolean_: ");
		result.append(runtimeInfo_java_lang_Boolean_);
		result.append(", stackTraces_java_lang_Boolean_: ");
		result.append(stackTraces_java_lang_Boolean_);
		result.append(", treeMetadata_java_lang_Boolean_: ");
		result.append(treeMetadata_java_lang_Boolean_);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(')');
		return result.toString();
	}

} //AppBuilder_coreImpl
