package clases;

import java.time.LocalDate;

public class Planilla {
    // Variable estática para gestionar el incremento automático del ID de planilla
    private int idIncremento = 1; // Cambiado para empezar en 1

    // Atributos de la clase Planilla
    private int idPlanilla;
    private LocalDate fechaCreacion;
    private String mesPuesto;
    private String fechaPago;
    private int cedulaEmpleado;
    private String nomEmpleado;
    private float salBase;
    private float totalPluses;
    private float salBruto;
    private float deducCCSS;
    private float deducBP;
    private float salNeto;

    /**
     * Constructor principal que inicializa una nueva instancia de la clase Planilla con todos sus atributos.
     * @param fechaCreacion
     * @param mesPuesto
     * @param fechaPago
     * @param cedulaEmpleado
     * @param nomEmpleado
     * @param salBase
     * @param totalPluses
     * @param salBruto
     * @param deducCCSS
     * @param deducBP
     * @param salNeto
     */
    public Planilla(LocalDate fechaCreacion, String mesPuesto, String fechaPago, int cedulaEmpleado, String nomEmpleado, float salBase, float totalPluses, float salBruto, float deducCCSS, float deducBP, float salNeto) {
        this.idPlanilla = idIncremento++;
        this.fechaCreacion = fechaCreacion;
        this.mesPuesto = mesPuesto;
        this.fechaPago = fechaPago;
        this.cedulaEmpleado = cedulaEmpleado;
        this.nomEmpleado = nomEmpleado;
        this.salBase = salBase;
        this.totalPluses = totalPluses;
        this.salBruto = salBruto;
        this.deducCCSS = deducCCSS;
        this.deducBP = deducBP;
        this.salNeto = salNeto;
    }

    /**
     * Constructor por defecto que inicializa los atributos con valores predeterminados.
     */
    public Planilla() {
        this.idPlanilla = idIncremento++;
        this.fechaCreacion = null;
        this.mesPuesto = "";
        this.fechaPago = null;
        this.cedulaEmpleado = 0;
        this.nomEmpleado = "";
        this.salBase = 0;
        this.totalPluses = 0;
        this.salBruto = 0;
        this.deducCCSS = 0;
        this.deducBP = 0;
        this.salNeto = 0;
    }
    // Métodos getter y setter para cada atributo
    /**
     * Obtiene el ID de la planilla.
     * @return El ID de la planilla.
     */
    public int getIdPlanilla() {
        return idPlanilla;
    }

    public int getIdIncremento() {
        return idIncremento;
    }

    
    
    /**
     * Establece el ID de la planilla.
     * @param idPlanilla El ID de la planilla.
     */
    public void setIdPlanilla(int idPlanilla) {
        this.idPlanilla = idPlanilla;
    }

    /**
     * Obtiene la fecha de creación de la planilla.
     * @return La fecha de creación de la planilla.
     */
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Establece la fecha de creación de la planilla.
     * @param fechaCreacion La fecha de creación de la planilla.
     */
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Obtiene el mes y puesto correspondiente a la planilla.
     * @return El mes y puesto correspondiente.
     */
    public String getMesPuesto() {
        return mesPuesto;
    }

    /**
     * Establece el mes y puesto correspondiente a la planilla.
     * @param mesPuesto El mes y puesto correspondiente.
     */
    public void setMesPuesto(String mesPuesto) {
        this.mesPuesto = mesPuesto;
    }

    /**
     * Obtiene la fecha de pago de la planilla.
     * @return La fecha de pago.
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Establece la fecha de pago de la planilla.
     * @param fechaPago La fecha de pago.
     */
    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     * Obtiene la cédula del empleado.
     * @return La cédula del empleado.
     */
    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    /**
     * Establece la cédula del empleado.
     * @param cedulaEmpleado La cédula del empleado.
     */
    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return El nombre del empleado.
     */
    public String getNomEmpleado() {
        return nomEmpleado;
    }

    /**
     * Establece el nombre del empleado.
     * @param nomEmpleado El nombre del empleado.
     */
    public void setNomEmpleado(String nomEmpleado) {
        this.nomEmpleado = nomEmpleado;
    }

    /**
     * Obtiene el salario base del empleado.
     * @return El salario base.
     */
    public float getSalBase() {
        return salBase;
    }

    /**
     * Establece el salario base del empleado.
     * @param salBase El salario base.
     */
    public void setSalBase(float salBase) {
        this.salBase = salBase;
    }

    /**
     * Obtiene el total de pluses salariales.
     * @return El total de pluses.
     */
    public float getTotalPluses() {
        return totalPluses;
    }

    /**
     * Establece el total de pluses salariales.
     * @param totalPluses El total de pluses.
     */
    public void setTotalPluses(float totalPluses) {
        this.totalPluses = totalPluses;
    }

    /**
     * Obtiene el salario bruto del empleado.
     * @return El salario bruto.
     */
    public float getSalBruto() {
        return salBruto;
    }

    /**
     * Establece el salario bruto del empleado.
     * @param salBruto El salario bruto.
     */
    public void setSalBruto(float salBruto) {
        this.salBruto = salBruto;
    }

    /**
     * Obtiene la deducción para la CCSS.
     * @return La deducción para la CCSS.
     */
    public float getDeducCCSS() {
        return deducCCSS;
    }

    /**
     * Establece la deducción para la CCSS.
     * @param deducCCSS La deducción para la CCSS.
     */
    public void setDeducCCSS(float deducCCSS) {
        this.deducCCSS = deducCCSS;
    }

    /**
     * Obtiene la deducción para el Banco Popular.
     * @return La deducción para el Banco Popular.
     */
    public float getDeducBP() {
        return deducBP;
    }

    /**
     * Establece la deducción para el Banco Popular.
     * @param deducBP La deducción para el Banco Popular.
     */
    public void setDeducBP(float deducBP) {
        this.deducBP = deducBP;
    }

    /**
     * Obtiene el salario neto del empleado.
     * @return El salario neto.
     */
    public float getSalNeto() {
        return salNeto;
    }

    /**
     * Establece el salario neto del empleado.
     * @param salNeto El salario neto.
     */
    public void setSalNeto(float salNeto) {
        this.salNeto = salNeto;
    }
    
}
