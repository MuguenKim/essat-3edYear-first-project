from rest_framework import routers
from pfes.viewSets import PfeViewSet, TypeViewSet

router = routers.DefaultRouter()

router.register('type', TypeViewSet)
router.register('pfe', PfeViewSet)
