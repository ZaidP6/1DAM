SELECT provincia, anio, porcHombre(hombres::"numeric"/(hombres + mujeres)), porcMucjer, nHombres, nMujeres
FROM demografia_basica