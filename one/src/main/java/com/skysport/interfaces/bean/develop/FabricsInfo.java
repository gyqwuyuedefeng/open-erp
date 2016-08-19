package com.skysport.interfaces.bean.develop;import java.util.List;/** * 面料信息 */public class FabricsInfo extends MaterialInfo {    private String id;    private String fabricId;    private String fabricNo;    private String fabricName;    private String serialNumber;    private String specificationId;    /**     * 防泼水     */    private String waterRepllentId;    private String dyeId;    private String blcId;    private String momcId;    private String comocId;    private String wvpId;    private String mtId;    private String woblcId;    private int delFlag;    private String remark;    private String updateTime;    private String type;    private List<KFMaterialPantone> compositePantoneIds;    /**     * 面料序号     */    private String nameNum;    /**     * 面料是否在报价中显示     */    private int isShow;    //以下为复合材料的组成    /**     * 材质     */    private String compositeClassicId;    /**     * 颜色     */    private String compositePantoneId;    /**     * 品名     */    private String compositeProductTypeId;    /**     * 纱支规格     */    private String compositeSpecificationId;    /**     * 染色方式     */    private String compositeDyeId;    /**     * 复合防泼水     */    private String compositeWaterRepllentId;    /**     * 复合透湿程度     */    private String compositeWvpId;    /**     * 水压     */    private String waterProofId;    /**     * 透气     */    private String permeabilityId;    /**     * 接缝水压     */    private String waterpressureId;    /**     * 抗紫外线     */    private String ultravioletProtectionId;    /**     * 快干     */    private String quickDryId;    /**     * 防油     */    private String oilProofId;    /**     * 防蚊虫     */    private String antMosquitosId;    /**     * 复合水压     */    private String compositeWaterProofId;    /**     * 复合透气     */    private String compositePermeabilityId;    /**     * 复合接缝水压     */    private String compositeWaterpressureId;    /**     * 复合抗紫外线     */    private String compositeUltravioletProtectionId;    /**     * 复合快干     */    private String compositeQuickDryId;    /**     * 复合防油     */    private String compositeOilProofId;    /**     * 复合防蚊虫     */    private String compositeAntMosquitosId;    public String getCompositeWvpId() {        return compositeWvpId;    }    public void setCompositeWvpId(String compositeWvpId) {        this.compositeWvpId = compositeWvpId;    }    public String getWaterProofId() {        return waterProofId;    }    public void setWaterProofId(String waterProofId) {        this.waterProofId = waterProofId;    }    public String getPermeabilityId() {        return permeabilityId;    }    public void setPermeabilityId(String permeabilityId) {        this.permeabilityId = permeabilityId;    }    public String getUltravioletProtectionId() {        return ultravioletProtectionId;    }    public void setUltravioletProtectionId(String ultravioletProtectionId) {        this.ultravioletProtectionId = ultravioletProtectionId;    }    public String getQuickDryId() {        return quickDryId;    }    public void setQuickDryId(String quickDryId) {        this.quickDryId = quickDryId;    }    public String getOilProofId() {        return oilProofId;    }    public void setOilProofId(String oilProofId) {        this.oilProofId = oilProofId;    }    public String getAntMosquitosId() {        return antMosquitosId;    }    public void setAntMosquitosId(String antMosquitosId) {        this.antMosquitosId = antMosquitosId;    }    public String getCompositeWaterProofId() {        return compositeWaterProofId;    }    public void setCompositeWaterProofId(String compositeWaterProofId) {        this.compositeWaterProofId = compositeWaterProofId;    }    public String getCompositePermeabilityId() {        return compositePermeabilityId;    }    public void setCompositePermeabilityId(String compositePermeabilityId) {        this.compositePermeabilityId = compositePermeabilityId;    }    public String getCompositeWaterpressureId() {        return compositeWaterpressureId;    }    public void setCompositeWaterpressureId(String compositeWaterpressureId) {        this.compositeWaterpressureId = compositeWaterpressureId;    }    public String getCompositeQuickDryId() {        return compositeQuickDryId;    }    public void setCompositeQuickDryId(String compositeQuickDryId) {        this.compositeQuickDryId = compositeQuickDryId;    }    public String getCompositeOilProofId() {        return compositeOilProofId;    }    public void setCompositeOilProofId(String compositeOilProofId) {        this.compositeOilProofId = compositeOilProofId;    }    public String getCompositeAntMosquitosId() {        return compositeAntMosquitosId;    }    public void setCompositeAntMosquitosId(String compositeAntMosquitosId) {        this.compositeAntMosquitosId = compositeAntMosquitosId;    }    public FabricsInfo() {        super();    }    public String getFabricNo() {        return fabricNo;    }    public void setFabricNo(String fabricNo) {        this.fabricNo = fabricNo;    }    @Override    public FabricsInfo clone() throws CloneNotSupportedException {        FabricsInfo fabricsInfo = (FabricsInfo) super.clone();        return fabricsInfo;    }    @Override    public String getId() {        return id;    }    @Override    public void setId(String id) {        this.id = id;    }    public String getFabricId() {        return fabricId;    }    public void setFabricId(String fabricId) {        this.fabricId = fabricId;    }    public String getFabricName() {        return fabricName;    }    public void setFabricName(String fabricName) {        this.fabricName = fabricName;    }    public String getSerialNumber() {        return serialNumber;    }    public void setSerialNumber(String serialNumber) {        this.serialNumber = serialNumber;    }    public String getSpecificationId() {        return specificationId;    }    public void setSpecificationId(String specificationId) {        this.specificationId = specificationId;    }    public String getDyeId() {        return dyeId;    }    public void setDyeId(String dyeId) {        this.dyeId = dyeId;    }    public String getWaterRepllentId() {        return waterRepllentId;    }    public void setWaterRepllentId(String waterRepllentId) {        this.waterRepllentId = waterRepllentId;    }    public String getBlcId() {        return blcId;    }    public void setBlcId(String blcId) {        this.blcId = blcId;    }    public String getMomcId() {        return momcId;    }    public void setMomcId(String momcId) {        this.momcId = momcId;    }    public String getComocId() {        return comocId;    }    public void setComocId(String comocId) {        this.comocId = comocId;    }    public String getWvpId() {        return wvpId;    }    public void setWvpId(String wvpId) {        this.wvpId = wvpId;    }    public String getMtId() {        return mtId;    }    public void setMtId(String mtId) {        this.mtId = mtId;    }    public String getWoblcId() {        return woblcId;    }    public void setWoblcId(String woblcId) {        this.woblcId = woblcId;    }    @Override    public int getDelFlag() {        return delFlag;    }    @Override    public void setDelFlag(int delFlag) {        this.delFlag = delFlag;    }    @Override    public String getRemark() {        return remark;    }    @Override    public void setRemark(String remark) {        this.remark = remark;    }    @Override    public String getUpdateTime() {        return updateTime;    }    @Override    public void setUpdateTime(String updateTime) {        this.updateTime = updateTime;    }    public String getNameNum() {        return nameNum;    }    public void setNameNum(String nameNum) {        this.nameNum = nameNum;    }    public int getIsShow() {        return isShow;    }    public void setIsShow(int isShow) {        this.isShow = isShow;    }    public String getCompositeClassicId() {        return compositeClassicId;    }    public void setCompositeClassicId(String compositeClassicId) {        this.compositeClassicId = compositeClassicId;    }    public String getCompositePantoneId() {        return compositePantoneId;    }    public void setCompositePantoneId(String compositePantoneId) {        this.compositePantoneId = compositePantoneId;    }    public String getCompositeProductTypeId() {        return compositeProductTypeId;    }    public void setCompositeProductTypeId(String compositeProductTypeId) {        this.compositeProductTypeId = compositeProductTypeId;    }    public String getCompositeSpecificationId() {        return compositeSpecificationId;    }    public void setCompositeSpecificationId(String compositeSpecificationId) {        this.compositeSpecificationId = compositeSpecificationId;    }    public String getCompositeDyeId() {        return compositeDyeId;    }    public void setCompositeDyeId(String compositeDyeId) {        this.compositeDyeId = compositeDyeId;    }    public String getCompositeWaterRepllentId() {        return compositeWaterRepllentId;    }    public void setCompositeWaterRepllentId(String compositeWaterRepllentId) {        this.compositeWaterRepllentId = compositeWaterRepllentId;    }    public List<KFMaterialPantone> getCompositePantoneIds() {        return compositePantoneIds;    }    public void setCompositePantoneIds(List<KFMaterialPantone> compositePantoneIds) {        this.compositePantoneIds = compositePantoneIds;    }    public String getWaterpressureId() {        return waterpressureId;    }    public void setWaterpressureId(String waterpressureId) {        this.waterpressureId = waterpressureId;    }    public String getCompositeUltravioletProtectionId() {        return compositeUltravioletProtectionId;    }    public void setCompositeUltravioletProtectionId(String compositeUltravioletProtectionId) {        this.compositeUltravioletProtectionId = compositeUltravioletProtectionId;    }    public String getType() {        return type;    }    public void setType(String type) {        this.type = type;    }}