/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AppBuilder_core;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
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
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getAutoSynth <em>Auto Synth</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getContextAsMap <em>Context As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getOutdir <em>Outdir</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getRuntimeInfo <em>Runtime Info</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getStackTraces <em>Stack Traces</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getTreeMetadata <em>Tree Metadata</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AppBuilder_coreImpl#getStackbuilder_core <em>Stackbuilder core</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppBuilder_coreImpl extends MinimalEObjectImpl.Container implements AppBuilder_core {
	/**
	 * The default value of the '{@link #getAutoSynth() <em>Auto Synth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSynth()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_SYNTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoSynth() <em>Auto Synth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSynth()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoSynth = AUTO_SYNTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextAsMap() <em>Context As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextAsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextAsMap() <em>Context As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextAsMap()
	 * @generated
	 * @ordered
	 */
	protected String contextAsMap = CONTEXT_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutdir() <em>Outdir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdir()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTDIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutdir() <em>Outdir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdir()
	 * @generated
	 * @ordered
	 */
	protected String outdir = OUTDIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntimeInfo() <em>Runtime Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RUNTIME_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntimeInfo() <em>Runtime Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInfo()
	 * @generated
	 * @ordered
	 */
	protected Boolean runtimeInfo = RUNTIME_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getStackTraces() <em>Stack Traces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackTraces()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STACK_TRACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStackTraces() <em>Stack Traces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackTraces()
	 * @generated
	 * @ordered
	 */
	protected Boolean stackTraces = STACK_TRACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTreeMetadata() <em>Tree Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeMetadata()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TREE_METADATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreeMetadata() <em>Tree Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeMetadata()
	 * @generated
	 * @ordered
	 */
	protected Boolean treeMetadata = TREE_METADATA_EDEFAULT;

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
	 * The cached value of the '{@link #getStackbuilder_core() <em>Stackbuilder core</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackbuilder_core()
	 * @generated
	 * @ordered
	 */
	protected EList<StackBuilder_core> stackbuilder_core;

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
	public Boolean getAutoSynth() {
		return autoSynth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoSynth(Boolean newAutoSynth) {
		Boolean oldAutoSynth = autoSynth;
		autoSynth = newAutoSynth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.APP_BUILDER_CORE__AUTO_SYNTH,
					oldAutoSynth, autoSynth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextAsMap() {
		return contextAsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextAsMap(String newContextAsMap) {
		String oldContextAsMap = contextAsMap;
		contextAsMap = newContextAsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.APP_BUILDER_CORE__CONTEXT_AS_MAP,
					oldContextAsMap, contextAsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutdir() {
		return outdir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutdir(String newOutdir) {
		String oldOutdir = outdir;
		outdir = newOutdir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.APP_BUILDER_CORE__OUTDIR,
					oldOutdir, outdir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRuntimeInfo() {
		return runtimeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeInfo(Boolean newRuntimeInfo) {
		Boolean oldRuntimeInfo = runtimeInfo;
		runtimeInfo = newRuntimeInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.APP_BUILDER_CORE__RUNTIME_INFO,
					oldRuntimeInfo, runtimeInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getStackTraces() {
		return stackTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStackTraces(Boolean newStackTraces) {
		Boolean oldStackTraces = stackTraces;
		stackTraces = newStackTraces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.APP_BUILDER_CORE__STACK_TRACES,
					oldStackTraces, stackTraces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTreeMetadata() {
		return treeMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreeMetadata(Boolean newTreeMetadata) {
		Boolean oldTreeMetadata = treeMetadata;
		treeMetadata = newTreeMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.APP_BUILDER_CORE__TREE_METADATA,
					oldTreeMetadata, treeMetadata));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
		case AwsworkbenchPackage.APP_BUILDER_CORE__AUTO_SYNTH:
			return getAutoSynth();
		case AwsworkbenchPackage.APP_BUILDER_CORE__CONTEXT_AS_MAP:
			return getContextAsMap();
		case AwsworkbenchPackage.APP_BUILDER_CORE__OUTDIR:
			return getOutdir();
		case AwsworkbenchPackage.APP_BUILDER_CORE__RUNTIME_INFO:
			return getRuntimeInfo();
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACK_TRACES:
			return getStackTraces();
		case AwsworkbenchPackage.APP_BUILDER_CORE__TREE_METADATA:
			return getTreeMetadata();
		case AwsworkbenchPackage.APP_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.APP_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.APP_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.APP_BUILDER_CORE__ADDITIONAL_CODE:
			return getAdditionalCode();
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACKBUILDER_CORE:
			return getStackbuilder_core();
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
		case AwsworkbenchPackage.APP_BUILDER_CORE__AUTO_SYNTH:
			setAutoSynth((Boolean) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__CONTEXT_AS_MAP:
			setContextAsMap((String) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__OUTDIR:
			setOutdir((String) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__RUNTIME_INFO:
			setRuntimeInfo((Boolean) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACK_TRACES:
			setStackTraces((Boolean) newValue);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__TREE_METADATA:
			setTreeMetadata((Boolean) newValue);
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
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACKBUILDER_CORE:
			getStackbuilder_core().clear();
			getStackbuilder_core().addAll((Collection<? extends StackBuilder_core>) newValue);
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
		case AwsworkbenchPackage.APP_BUILDER_CORE__AUTO_SYNTH:
			setAutoSynth(AUTO_SYNTH_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__CONTEXT_AS_MAP:
			setContextAsMap(CONTEXT_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__OUTDIR:
			setOutdir(OUTDIR_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__RUNTIME_INFO:
			setRuntimeInfo(RUNTIME_INFO_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACK_TRACES:
			setStackTraces(STACK_TRACES_EDEFAULT);
			return;
		case AwsworkbenchPackage.APP_BUILDER_CORE__TREE_METADATA:
			setTreeMetadata(TREE_METADATA_EDEFAULT);
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
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACKBUILDER_CORE:
			getStackbuilder_core().clear();
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
		case AwsworkbenchPackage.APP_BUILDER_CORE__AUTO_SYNTH:
			return AUTO_SYNTH_EDEFAULT == null ? autoSynth != null : !AUTO_SYNTH_EDEFAULT.equals(autoSynth);
		case AwsworkbenchPackage.APP_BUILDER_CORE__CONTEXT_AS_MAP:
			return CONTEXT_AS_MAP_EDEFAULT == null ? contextAsMap != null
					: !CONTEXT_AS_MAP_EDEFAULT.equals(contextAsMap);
		case AwsworkbenchPackage.APP_BUILDER_CORE__OUTDIR:
			return OUTDIR_EDEFAULT == null ? outdir != null : !OUTDIR_EDEFAULT.equals(outdir);
		case AwsworkbenchPackage.APP_BUILDER_CORE__RUNTIME_INFO:
			return RUNTIME_INFO_EDEFAULT == null ? runtimeInfo != null : !RUNTIME_INFO_EDEFAULT.equals(runtimeInfo);
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACK_TRACES:
			return STACK_TRACES_EDEFAULT == null ? stackTraces != null : !STACK_TRACES_EDEFAULT.equals(stackTraces);
		case AwsworkbenchPackage.APP_BUILDER_CORE__TREE_METADATA:
			return TREE_METADATA_EDEFAULT == null ? treeMetadata != null : !TREE_METADATA_EDEFAULT.equals(treeMetadata);
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
		case AwsworkbenchPackage.APP_BUILDER_CORE__STACKBUILDER_CORE:
			return stackbuilder_core != null && !stackbuilder_core.isEmpty();
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
		result.append(" (autoSynth: ");
		result.append(autoSynth);
		result.append(", contextAsMap: ");
		result.append(contextAsMap);
		result.append(", outdir: ");
		result.append(outdir);
		result.append(", runtimeInfo: ");
		result.append(runtimeInfo);
		result.append(", stackTraces: ");
		result.append(stackTraces);
		result.append(", treeMetadata: ");
		result.append(treeMetadata);
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

} //AppBuilder_coreImpl
