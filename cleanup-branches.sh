#!/bin/bash
# Script para eliminar las ramas remotas obsoletas del repositorio
# Ejecutar desde la raíz del repositorio con: bash cleanup-branches.sh

echo "Eliminando ramas remotas obsoletas..."

branches_to_delete=(
  "claude/add-network-module-pWlEu"
  "claude/add-retrofit-client-UVW8V"
  "claude/complete-auth-interceptor-398wP"
  "claude/merge-navigation-changes-LyoXK"
  "claude/resolve-homologar-conflicts-5tkTS"
  "config/dependencies"
  "navigation"
)

for branch in "${branches_to_delete[@]}"; do
  echo "Eliminando: $branch"
  git push origin --delete "$branch" 2>&1
  if [ $? -eq 0 ]; then
    echo "  ✓ Eliminada exitosamente"
  else
    echo "  ✗ Error al eliminar (puede que ya no exista)"
  fi
done

# Limpiar referencias locales obsoletas
echo ""
echo "Limpiando referencias locales obsoletas..."
git fetch --prune origin

echo ""
echo "Ramas remotas restantes:"
git branch -r
echo ""
echo "Limpieza completada."
