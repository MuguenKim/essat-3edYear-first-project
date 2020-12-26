from rest_framework import viewsets
from pfes.serializer import TypeSerializer, PfeSerializer
from pfes.models import Type, Pfe


class TypeViewSet(viewsets.ModelViewSet):
    queryset = Type.objects.all()
    serializer_class = TypeSerializer


class PfeViewSet(viewsets.ModelViewSet):
    queryset = Pfe.objects.all()
    serializer_class = PfeSerializer
